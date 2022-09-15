package prac4_5_6;
public class Square extends Rectangle {

    public Square(){
        this.filled = false;
        this.color = "yellow";
        this.length = 0;
        this.width = 0;
    }
    public Square(double side){
        this.filled = false;
        this.color = "yellow";
        this.length = side;
        this.width = side;
    }
    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
    }
    @Override
    public String toString() {
        return "Shape: square, side: " + this.width + " color: " + this.color;
    }
}