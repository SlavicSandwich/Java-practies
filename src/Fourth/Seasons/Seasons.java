package Fourth.Seasons;

public class Seasons {
    private String name;
    private int temperature;
    private String description;

    public Seasons(String name, int temperature, String description) {
        this.name = name;
        this.temperature = temperature;
        this.description = description;
    }

    void getSeasonData() {
        System.out.println("Name: " + this.name);
        System.out.println("Temperature: " + this.temperature);
        System.out.println("description: " + this.description);
    }
}