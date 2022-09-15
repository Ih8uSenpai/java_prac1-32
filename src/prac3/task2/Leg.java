package prac3.task2;
public class Leg {
    private String position;
    private int length;

    public Leg(String position, int length) {
        this.position = position;
        this.length = length;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Head{" +
                "position='" + position + '\'' +
                ", length=" + length +
                '}';
    }
}