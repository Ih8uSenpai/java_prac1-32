package prac7.task1;

public class Test {
    public static void main(String [] args){
        Cup cup = new Cup("With handle");
        Plate plate = new Plate();
        plate.setPlate_type("flat");
        cup.setCondition(true);
        plate.setCondition(true);
        cup.use();
        cup.clean();
        plate.use();
        plate.clean();
        System.out.println(cup);
        System.out.println(plate);
    }
}
