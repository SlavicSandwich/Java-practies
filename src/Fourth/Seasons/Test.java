package Fourth.Seasons;

enum Season {
    SUMMER {
        public Seasons info() {
            return new Seasons("Summer", 15, "Hot");
        };
    },
    Autumn {
        public Seasons info() {
            return new Seasons("Autumn", 9, "Bad");
        };
    },
    Winter {
        public Seasons info() {
            return new Seasons("Winter", -15, "Kinda cool");
        };
    },
    Spring {
        public Seasons info() {
            return new Seasons("Spring", 5, "Not good");
        };

    };

    public abstract Seasons info();
}

public class Test {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        summer.info().getSeasonData();
        for (Season i : Season.values())
            i.info().getSeasonData();
    }

}