package com.dbu.variant.search.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dbu.variant.search.domain.Variant;
import com.dbu.variant.search.services.VariantService;

@RestController
@RequestMapping("api/variant")
@CrossOrigin
public class VariantController {
  
  @Autowired
  private VariantService variantService;
  
  @GetMapping("/{gene}")
  public ResponseEntity<List<Variant>> getVariantByGene(@PathVariable String gene){
    return new ResponseEntity<List<Variant>>(variantService.getByGeneName(gene), HttpStatus.OK);
  }

}
