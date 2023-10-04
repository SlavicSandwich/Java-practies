package thirteen;

class telephone {
  private String number;

  public telephone(String str) {
    if (str.charAt(0) == '+')
      str = str.substring(1);
    String region = "";
    for (int i = 0; i < str.length() - 10; i++) {
      region += str.charAt(i);
    }
    String firstThree = "";
    for (int i = str.length() - 10; i < str.length() - 7; i++) {
      firstThree += str.charAt(i);
    }
    String secondThree = "";
    for (int i = str.length() - 7; i < str.length() - 4; i++) {
      secondThree += str.charAt(i);
    }

    String firstTwo = "";
    for (int i = str.length() - 4; i < str.length() - 2; i++) {
      firstTwo += str.charAt(i);
    }

    String secondTwo = "";
    for (int i = str.length() - 2; i < str.length(); i++) {
      secondTwo += str.charAt(i);
    }
    number = "+" + region + " " + firstThree + " " + secondThree + " " + firstTwo + " " + secondTwo;
  }

  public String getNumber() {
    return number;
  }

  public static void main(String[] args) {
    telephone tel = new telephone("+79131638283");
    System.out.println(tel.getNumber());
  }
}
