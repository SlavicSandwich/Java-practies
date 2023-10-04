package thirteen;

class Student {
  private String lastName;
  private String firstName;

  public Student() {
    this.lastName = "";
    this.firstName = "";
  }

  public Student(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  void getNames() {
    if (lastName == "" | firstName == "") {
      System.out.println("No name stated");
    } else {
      System.out.println(lastName + " " + firstName);
    }
  }
}
