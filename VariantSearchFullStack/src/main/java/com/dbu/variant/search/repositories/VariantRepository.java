package com.dbu.variant.search.repositories;

import java.util.List;
import org.apache.lucene.index.SegmentInfos.FindSegmentsFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dbu.variant.search.domain.Variant;

@Repository
public interface VariantRepository extends CrudRepository<Variant, Long>{
  
  List<Variant> findByGene(String gene);
  
}
