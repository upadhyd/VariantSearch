package com.dbu.variant.search.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.dbu.variant.search.domain.Suggestions;
import com.dbu.variant.search.domain.Variant;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;
import static com.dbu.variant.search.constant.Paths.VERSION;
import static com.dbu.variant.search.constant.Paths.VARIANT;
import static com.dbu.variant.search.constant.Paths.SEARCH;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@WebMvcTest(VariantController.class)
public class VariantControllerTest {
  @Autowired
  private MockMvc mvc;

  @MockBean
  private VariantController variantController;
  
  @Test
  public void getVariantByGene() throws Exception {
    
    Variant variant = new Variant();
    variant.setGene("BRAF");
    variant.setNucleotideChange("NM_004333.4:c.1391G>T");
    variant.setProteinChange("p.Gly464Val");
    variant.setId(1L);
    
    List<Variant> allVariants = singletonList(variant);
    ResponseEntity<List<Variant>> re = new ResponseEntity<List<Variant>>(allVariants, HttpStatus.OK);
    
    given(variantController.getVariantByGene(variant.getGene())).willReturn(re);
    
    mvc.perform(get(VERSION+VARIANT+"/"+variant.getGene()).contentType(APPLICATION_JSON)).andExpect(status().isOk())
        .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$[0].proteinChange", is(variant.getProteinChange())));

  }
  
  
    @Test public void search() throws Exception {
    
    Set<String> geneSet = new LinkedHashSet<>(); geneSet.add("BRAF"); geneSet.add("GBRD");
    
    Suggestions sw = new Suggestions(); sw.setSuggestions(geneSet);
        
    given(variantController.search("B")).willReturn(sw);
    
    mvc.perform(get(VERSION+VARIANT+SEARCH+"/?term=B")).andExpect(status().isOk()).andExpect(
    jsonPath("$.suggestions", hasSize(2)));
    
    }
}
