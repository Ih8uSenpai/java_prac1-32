package prac7.task1;

public class Plate extends Dish{
    private String Plate_type;
    public Plate() {
        type = "Plate";
    }

    public Plate(String plate_type) {
        Plate_type = plate_type;
        type = "Plate";
    }

    public void use(){
        System.out.println("Have a nice meal!");
        setCondition(false);
    }


    public void setPlate_type(String plate_type) {
        Plate_type = plate_type;
    }

    public String getPlate_type() {
        return Plate_type;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "Plate_type='" + Plate_type + '\'' +
                ", type='" + type + '\'' +
                ", condition=" + condition +
                '}';
    }
}
