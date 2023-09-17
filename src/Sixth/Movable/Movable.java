package Sixth.Movable;

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}


class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp(){
        this.y -= this.ySpeed;
    }

    public void moveDown(){
        this.y += this.ySpeed;
    }

    public void moveLeft(){
        this.x -= this.xSpeed;
    }
    public void moveRight(){
        this.x += this.xSpeed;
    }

    @Override
    public String toString(){
        return "Point " + this.x + " " + this.y;
    }
}


class MovableCircle extends MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle " + this.x + " " + this.y + " " + this.radius;
    }
}

