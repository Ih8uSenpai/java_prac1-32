package prac3.task2;
public class Human {
    private Hand hand1, hand2;
    private Head head;
    private Leg leg1, leg2;
    private int height, age;
    private String name;
    public Human(int height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHand1(Hand hand1) {
        this.hand1 = hand1;
    }

    public void setHand2(Hand hand2) {
        this.hand2 = hand2;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg1(Leg leg1) {
        this.leg1 = leg1;
    }

    public void setLeg2(Leg leg2) {
        this.leg2 = leg2;
    }

    @Override
    public String toString() {
        return "Human{" +
                "hand1=" + hand1 +
                ", hand2=" + hand2 +
                ", head=" + head +
                ", leg1=" + leg1 +
                ", leg2=" + leg2 +
                ", height=" + height +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
