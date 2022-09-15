package prac2.task2;
public class Ball {
    private String color;
    private int diameter;

    public Ball(String color, int diameter){
        this.color = color;
        this.diameter = diameter;
    }
    public Ball(String color){
        this.color = color;
        this.diameter = 0;
    }
    public Ball(int diameter){
        this.color = "undefined";
        this.diameter = diameter;
    }
    public Ball(){
        this.color = "undefined";
        this.diameter = 0;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int diameter) {
        this.diameter = diameter;
    }
    public String getColor(){
        return color;
    }
    public int getSize() {
        return diameter;
    }
    @Override
    public String toString() {
        return "This ball has " + color + " color and " + diameter + " centimeters size in diameter";
    }
}