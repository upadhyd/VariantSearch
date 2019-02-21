package com.dbu.variant.search.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbu.variant.search.domain.Variant;
import com.dbu.variant.search.repositories.VariantRepository;

@Service
public class VariantService {

  @Autowired
  private VariantRepository variantRepository;
  
  public List<Variant> getByGeneName(String gene) {
    return variantRepository.findByGene(gene);
  }
}
