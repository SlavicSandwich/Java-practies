package Second.PokerJoker;

import java.util.Random;
import java.util.Scanner;

public class Poker {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] cards = new String[54];

    System.out.print("Введите количество игроков: ");
    int n = in.nextInt();

    String[] numb = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    int j = 0;
    int count = 0;
    for (int i = 0; i < 52; i++) {
      switch (j) {
        case 0:
          cards[i] = numb[count] + "_Hearts";
          break;
        case 1:
          cards[i] = numb[count] + "_Spades";
          break;
        case 2:
          cards[i] = numb[count] + "_Diamonds";
          break;
        case 3:
          cards[i] = numb[count] + "_Clubs";
          break;
      }

      if (j == 3) {
        j = 0;
        count++;
      } else
        j++;
    }
    cards[52] = "Joker_Red";
    cards[53] = "Joker_Black";

    Random rand = new Random();

    for (int i = 0; i < 100; i++) {
      int k = rand.nextInt(54);
      String tmp;
      tmp = cards[k];
      cards[k] = cards[j];
      cards[j] = tmp;
    }

    for (int i = 1; i < 55; i++) {
      System.out.print(cards[i - 1] + " ");
      if (i % 5 == 0)
        System.out.println();
      if (i == n * 5)
        break;
    }
  }
}
