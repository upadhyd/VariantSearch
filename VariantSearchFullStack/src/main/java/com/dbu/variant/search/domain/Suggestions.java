package com.dbu.variant.search.domain;


import java.util.List;
import java.util.Set;

/**
 * Created by jonaspfeifer on 07.05.17.
 */
public class Suggestions {

  Set<String> suggestions;

  public Set<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(Set<String> suggestions) {
    this.suggestions = suggestions;
  }
}