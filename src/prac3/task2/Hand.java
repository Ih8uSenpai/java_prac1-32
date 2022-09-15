package prac3.task2;
public class Hand {
    protected String position;
    protected int size;

    public Hand(String position, int size) {
        this.position = position;
        this.size = size;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "position='" + position + '\'' +
                ", size=" + size +
                '}';
    }
}
