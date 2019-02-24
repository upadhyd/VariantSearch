package com.dbu.variant.search.repositories;

import java.util.List;
import java.util.Set;
import org.apache.lucene.index.SegmentInfos.FindSegmentsFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dbu.variant.search.domain.Variant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface VariantRepository extends CrudRepository<Variant, Long>{
  
  List<Variant> findByGene(String gene);
  
  @Query("SELECT gene FROM Variant where gene like %:keyword%")
  public Set<String> search(@Param("keyword") String keyword);
  
}
