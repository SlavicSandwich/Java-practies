package thirty;

public final class Drink extends MenuItem implements Alcoholable{

    private double alcoholVol;
    private DrinkTypeEnum type;

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    public void setAlcoholVol(double alcoholVol) {
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    public void setType(DrinkTypeEnum type) {
        this.type = type;
    }
}
