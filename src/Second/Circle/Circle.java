package Second.Circle;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double get_radius() {
        return this.radius;
    }

    double get_diameter(){
        return this.radius * 2;
    }

    void set_radius(double radius) {
        this.radius = radius;
    }

    double get_area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double get_len(){
        return Math.PI * this.radius * 2;
    }

    public String toString() {
        return "Radius: " + this.radius + " Diameter: " + this.radius * 2;
    }

//    @Override
//    public boolean equals(Second.authro.Circle circle){
//        if (this == circle)
//            return true;
//
//        if (circle == null)
//            return false;
//
//        if (!(circle instanceof Second.authro.Circle))
//            return false;
//
//        Second.authro.Circle circle1 = (Second.authro.Circle) circle;
//        return this.radius == circle1.radius;
//    }
}