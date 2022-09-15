package prac4_5_6;
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    private boolean checkSpeed(int a, int b) {
        return a == b;
    }
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        if (!checkSpeed(xSpeed, ySpeed)) {
            System.out.println("incorrect speed, try again");
        }
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "topLeft = " + this.topLeft.toString() + "\n" + "bottomRight = " + this.bottomRight.toString();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}