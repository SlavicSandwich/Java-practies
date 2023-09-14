package Fourth.Shape;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "Unassigned";
        this.filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
}

class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override

    public double getArea(){
        return 2 * Math.PI * this.radius * this.radius;
    }
    @Override

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return " " + getArea() + " " + getPerimeter();
    }
}

class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = 0;
        this.length = 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.width * 2 + this.length * 2;
    }

    @Override
    public String toString(){
        return " " + getArea() + " " + getPerimeter();
    }
}

class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
}