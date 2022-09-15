package prac3.task1;
public class CircleTest {
    public static void main(String [] args){
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle();
        circle2.setRadius(10);
        System.out.println("circle 1\n" + circle1 + "\nArea: " + circle1.getArea() + "\nPerimeter: " + circle1.getPerimeter() + "\ncircle 2\n" + circle2);
    }
}