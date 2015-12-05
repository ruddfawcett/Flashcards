import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private String name;
  private String description;

  private List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();
  }

  public Deck(String name, String description, List<Card> cards) {
    this.name = name;
    this.description = description;
    this.cards = cards;
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public String toString() {
    return cards.toString();
  }

  public int size() {
    return cards.size();
  }

  public List<Card> getCards() {
    return cards;
  }

  public void move(Card a, Deck x) {
    x.add(a);
    this.remove(a);
  }

  public void add(Card card) {
    cards.add(card);
  }

  public void remove(Card card) {
    cards.remove(card);
  }
}
