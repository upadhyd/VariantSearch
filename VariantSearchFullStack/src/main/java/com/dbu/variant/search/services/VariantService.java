package com.dbu.variant.search.services;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbu.variant.search.domain.Suggestions;
import com.dbu.variant.search.domain.Variant;
import com.dbu.variant.search.repositories.VariantRepository;
import static java.util.stream.Collectors.toCollection;

@Service
public class VariantService {

  @Autowired
  private VariantRepository variantRepository;
  
  public List<Variant> getByGeneName(String gene) {
    return variantRepository.findByGene(gene.toUpperCase());
  }
  
  public Suggestions search(String keyword) {
    Set<String> suggestions = variantRepository.search(keyword.toUpperCase());
    int n = suggestions.size() > 7 ? 7 : suggestions.size();
    Set<String> subSet = suggestions.stream()
        .limit(20)
        .collect(toCollection(LinkedHashSet::new));
    
    Suggestions sw = new Suggestions();
    sw.setSuggestions(subSet);
    return sw;
  }
}
