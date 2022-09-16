package prac7.task2;

public abstract class Dog {
    private String breedName;
    private int weight;
    private String color;
    protected boolean isAggressive;

    public String getBreedName() { return breedName; }
    public int getWeight() { return weight; }
    public String getColor() { return color; }

    public Dog(String breedName, int weight, String color) {
        this.breedName = breedName;
        this.weight = weight;
        this.color = color;
        this.isAggressive = false;
    }

    public void displayInfo () {
        System.out.println(getBreedName());
        System.out.println("Average weight: " + getWeight());
        System.out.println("Usual color: " + getColor());
        System.out.println("Barking example: " + bark());
        if (isAggressive) {
            System.out.println("Attention! This breed is dangerous!");
        }
    }
    public abstract String bark();

    public static void main(String args[]) {
        Wolf wolf = new Wolf();
        My_teammate average_teammate = new My_teammate();
        Rottweiler rottweiler = new Rottweiler();
        wolf.displayInfo();
        System.out.println("\n");
        rottweiler.displayInfo();
        System.out.println("\n");
        average_teammate.displayInfo();

    }
}
