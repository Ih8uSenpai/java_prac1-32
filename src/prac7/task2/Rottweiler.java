package prac7.task2;

public class Rottweiler extends Dog{
    public String bark() {
        return ("grrrr woof wawfoof rrrarrr rrr wwrrr");
    }
    public Rottweiler() {
        super("Rottweiler", 50, "black-brown");
        this.isAggressive = true;
    }
}
