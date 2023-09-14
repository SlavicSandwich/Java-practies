package Fourth.Trans;

abstract class Trans {
    protected double time;
    protected double price;

    public Trans(){
        this.time = 0;
        this.price = 0;
    }

    abstract double travel();
}


class Automobile extends Trans{
    public Automobile(double time, double price){
        this.time = 10;
        this.price = 20;
    }

    public double travel(){
        return this.time * this.price;
    }
}


class Plane extends Trans{
    public Plane(double time, double price){
        this.time = 1;
        this.price = 100;
    }

    public double travel(){
        return this.time * this.price;
    }
}

class Ship extends Trans{
    public Ship(double time, double price){
        this.time = 5;
        this.price = 40;
    }

    public double travel(){
        return this.time * this.price;
    }
}

class Train extends Trans{
    public Train(double time, double price){
        this.time = 20;
        this.price = 10;
    }

    public double travel(){
        return this.time * this.price;
    }
}

