package Fourth.Seasons.Trash;

enum Seasons {
  SUMMER {
    public Season info() {
      return new Season("Summer", 15, "Low");
    };
  },
  Autumn {
    public Season info() {
      return new Season("Autumn", 9, "High");
    };
  },
  Winter {
    public Season info() {
      return new Season("Winter", -15, "Low");
    };
  },
  Spring {
    public Season info() {
      return new Season("Spring", 5, "High");
    };
  };

  public abstract Season info();
}

public class SeasonsTest {
  public static void main(String[] args) {
    Seasons winter = Seasons.SUMMER;
    winter.info().getSeasonData();
  }

}
