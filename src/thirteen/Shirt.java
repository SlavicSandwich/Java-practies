package thirteen;

public class Shirt {
  private String size;
  private String code;
  private String name;
  private String color;

  public Shirt(String str) {
    String[] splitstr = str.split(", ");
    this.code = splitstr[0];
    this.name = splitstr[1];
    this.color = splitstr[2];
    this.size = splitstr[3];
  }

  public String toString() {
    return code + ", " + name + ", " + color + ", " + size;
  }
}
