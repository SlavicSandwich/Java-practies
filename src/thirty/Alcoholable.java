package thirty;

public class Alcoholable extends Drink {
    public Alcoholable(double cost, String name, String description) {
        super(cost, name, description);
    }

    public boolean isAlcoholicDrink(Drink drink) {
        return true;
    }

    public double getAlcoholVol(Drink drink){
        return drink.getAlcoholVol();
    }
}
