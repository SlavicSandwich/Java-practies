package Fourth.Phone;

public class Phone {
  private String number;
  private String model;
  private String weight;

  public Phone(String number, String model, String weight) {
    this(number, model);
    this.weight = weight;
  }

  public Phone(String number, String model) {
    this();
    this.number = number;
    this.model = model;
  }

  public Phone() {
    this.number = "Unassigned";
    this.model = "Unassigned";
    this.weight = "Unassigned";
  }

  public void formatOutput() {
    System.out.println("Number: " + this.number);
    System.out.println("Model: " + this.model);
    System.out.println("Weight: " + this.weight);
  }

  public void receiveCall(String name) {
    System.out.println("Звонит " + name);
  }

  public void getNumber() {
    System.out.println(number);
  }

  public void receiveCall(String name, String number) {
    System.out.println("Звонит " + name + " по номеру " + number);
  }

  public void sendMessage(String[] numbers) {
    for (String number : numbers) {
      System.out.println(number);
    }
  }
}
