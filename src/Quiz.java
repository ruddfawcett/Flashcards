package src;

import java.util.Scanner;

public class Quiz {
  private Deck unlearned;
  private Deck learned;

  private Scanner scanner;

  public Quiz(Deck deck) {
    this.unlearned = deck;
    this.learned = new Deck();
    this.scanner = new Scanner(System.in);
  }

  public void start() {
    do {
      unlearned.shuffle();
      ask();
    }
    while(unlearned.size() != 0);


  }

  public void stop() {
    System.out.println("You have finished this deck!");
    System.exit(1);
  }

  public void ask() {
    for (int i = 0; i < unlearned.size(); i++) {
      if (unlearned.size() == 0) {
        stop();
      }

      Card current = unlearned.getCards().get(i);

      System.out.println("> " + current.toString(true));
      String definition = scanner.nextLine();

      if (definition.equals(null)) {
        continue;
      }
      else {
        if (current.getDefinition().equals(definition)) {
          unlearned.move(current, learned);
        }
      }
    }
  }

  public boolean correct() {
    return false;
  }
}
