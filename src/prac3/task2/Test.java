package prac3.task2;
public class Test {
    public static void main(String [] args){
        Human human = new Human(156, 16, "Aya");
        Hand right_hand = new Hand("pos1", 1);
        Hand left_hand = new Hand("pos2", 1);
        Leg right_leg = new Leg("pos3", 70);
        Leg left_leg = new Leg("pos4", 70);
        Head head = new Head("pos5", 30);
        human.setHand1(right_hand);
        human.setHand2(left_hand);
        human.setHead(head);
        human.setLeg1(right_leg);
        human.setLeg2(left_leg);
        System.out.println(human);
    }
}