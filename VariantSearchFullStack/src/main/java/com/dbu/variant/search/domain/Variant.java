package com.dbu.variant.search.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Variant {

  @Id
  private Long Id;
  
  @NotBlank
  private String gene;
  private String nucleotideChange;
  private String proteinChange;
  private String otherMappings;
  private String alias;
  private String transcripts;
  private String region;
  private String reportedClassification;
  private String inferredClassification;
  private String source;
  private String lastEvaluated;
  private String lastUpdated;
  private String url;
  private String submitterComment;
  private String assembly;
  private String chr;
  private String genomicStart;
  private String genomicStop;
  private String ref;
  @Column(length=1100)
  private String alt;
  private String accession;
  @Column(length=1100)
  private String reportedRef;
  private String reportedAlt;
  
  public Long getId() {
    return Id;
  }
  public void setId(Long id) {
    Id = id;
  }
  public String getGene() {
    return gene;
  }
  public void setGene(String gene) {
    this.gene = gene;
  }
  public String getNucleotideChange() {
    return nucleotideChange;
  }
  public void setNucleotideChange(String nucleotideChange) {
    this.nucleotideChange = nucleotideChange;
  }
  public String getProteinChange() {
    return proteinChange;
  }
  public void setProteinChange(String proteinChange) {
    this.proteinChange = proteinChange;
  }
  public String getOtherMappings() {
    return otherMappings;
  }
  public void setOtherMappings(String otherMappings) {
    this.otherMappings = otherMappings;
  }
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }
  public String getTranscripts() {
    return transcripts;
  }
  public void setTranscripts(String transcripts) {
    this.transcripts = transcripts;
  }
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }
  public String getReportedClassification() {
    return reportedClassification;
  }
  public void setReportedClassification(String reportedClassification) {
    this.reportedClassification = reportedClassification;
  }
  public String getInferredClassification() {
    return inferredClassification;
  }
  public void setInferredClassification(String inferredClassification) {
    this.inferredClassification = inferredClassification;
  }
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }
  public String getLastEvaluated() {
    return lastEvaluated;
  }
  public void setLastEvaluated(String lastEvaluated) {
    this.lastEvaluated = lastEvaluated;
  }
  public String getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public String getSubmitterComment() {
    return submitterComment;
  }
  public void setSubmitterComment(String submitterComment) {
    this.submitterComment = submitterComment;
  }
  public String getAssembly() {
    return assembly;
  }
  public void setAssembly(String assembly) {
    this.assembly = assembly;
  }
  public String getChr() {
    return chr;
  }
  public void setChr(String chr) {
    this.chr = chr;
  }
  public String getGenomicStart() {
    return genomicStart;
  }
  public void setGenomicStart(String genomicStart) {
    this.genomicStart = genomicStart;
  }
  public String getGenomicStop() {
    return genomicStop;
  }
  public void setGenomicStop(String genomicStop) {
    this.genomicStop = genomicStop;
  }
  public String getRef() {
    return ref;
  }
  public void setRef(String ref) {
    this.ref = ref;
  }
  public String getAlt() {
    return alt;
  }
  public void setAlt(String alt) {
    this.alt = alt;
  }
  public String getAccession() {
    return accession;
  }
  public void setAccession(String accession) {
    this.accession = accession;
  }
  public String getReportedRef() {
    return reportedRef;
  }
  public void setReportedRef(String reportedRef) {
    this.reportedRef = reportedRef;
  }
  public String getReportedAlt() {
    return reportedAlt;
  }
  public void setReportedAlt(String reportedAlt) {
    this.reportedAlt = reportedAlt;
  }
  
  /**
   * Currently for search, we will be searching by gene name only. 
   * We don't have other search parameters for the search criteria
   * and hence do not see the need to implement equals and therefore hashcode
   * as each object will be uniquely identified by gene
   */
  
  // 
}
