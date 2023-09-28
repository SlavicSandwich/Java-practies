package Fourth.Seasons.Trash;

public class Season {
  private String name;
  private int temperature;
  private String morbidity;

  public Season(String name, int temperature, String morbidity) {
    this.name = name;
    this.temperature = temperature;
    this.morbidity = morbidity;
  }

  void getSeasonData() {
    System.out.println("Name: " + this.name);
    System.out.println("Temperature: " + this.temperature);
    System.out.println("Morbidity: " + this.morbidity);
  }
}
