package prac3.task2;
public class Head {
    private String position;
    private int size;

    public Head(String position, int size) {
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
        return "Head{" +
                "position='" + position + '\'' +
                ", size=" + size +
                '}';
    }
}