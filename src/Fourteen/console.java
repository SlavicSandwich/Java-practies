package Fourteen;

import java.util.Scanner;

class console {
  static String[] splitter(String str, String pat) {
    return str.split(pat);
  }

  static void output(String[] str) {
    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Че резать");
    String str = sc.nextLine();
    System.out.println("как резать?");
    String pat = sc.nextLine();

    output(splitter(str, pat));
  }
}
