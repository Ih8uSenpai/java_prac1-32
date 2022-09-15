package prac4_5_6;
abstract public class Shape {
    protected boolean filled;
    protected String color;

    public Shape(){

    }

    public Shape(String color, boolean filled){

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {

    }

    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString(){
        return "color: " + color + ", filled: " + this.color;
    }
}