package prac4_5_6;
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "green";
        width = 0;
        length = 0;
    }
    public Rectangle(double width, double length){
        this.filled = false;
        this.color = "green";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
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
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }
    @Override
    public String toString() {
        return "Shape: rectangle, length: "+this.length+", width: " + this.width + " color: "+this.color;
    }
}
