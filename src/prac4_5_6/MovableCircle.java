package prac4_5_6;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint (x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "center = " + "(" + center.x + "," + center.y + ")";
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveRight(){
        center.moveRight();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }
}