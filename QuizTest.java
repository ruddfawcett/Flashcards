import java.util.List;
import java.util.ArrayList;

public class QuizTest {
  public static void main(String[] args) {
    List<Card> cards = new ArrayList<Card>();

    for (int i = 0; i < 10; i++) {
      cards.add(new Card(Integer.toString(i), "def" + i));
    }

    Deck deck = new Deck("Test", "This is a test deck.", cards);
    Quiz quiz = new Quiz(deck);

    quiz.start();
  }
}
