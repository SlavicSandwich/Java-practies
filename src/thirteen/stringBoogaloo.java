package thirteen;

class StringBoogaloo {
  static void stringWork(String str) {
    System.out.println(str.charAt(-1));
    System.out.println(str.endsWith("!!!"));
    System.out.println(str.startsWith("I like"));
    System.out.println(str.contains("Java"));
    str.replace("a", "o");
    System.out.println(str);
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    String upper = str.substring(0, 1).toUpperCase() + str.substring(1);
    System.out.println(upper);
  }

  public static void main(String[] args) {
    stringWork("I like Java!!!");
  }
}