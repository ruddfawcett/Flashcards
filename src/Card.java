package src;

public class Card {
  private String term;
  private String definition;


  public Card(String term, String definition) {
    this.term = term;
    this.definition = definition;
  }

  public String getTerm() {
    return term;
  }

  public String getDefinition() {
    return definition;
  }

  public boolean isDefinition(String definition) {
    return this.definition.equals(definition);
  }

  public String toString(boolean front) {
    return front ? term : definition;
  }
}
