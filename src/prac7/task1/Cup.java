package prac7.task1;

public class Cup extends Dish{

    private String Cup_type;
    public Cup() {
        type = "Cup";
    }

    public Cup(String cup_type) {
        Cup_type = cup_type;
        type = "Cup";
    }

    public void use(){
        System.out.println("drink some coca-cola");
        setCondition(false);
    }


    public void setCup_type(String cup_type) {
        Cup_type = cup_type;
    }

    public String getCup_type() {
        return Cup_type;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "Cup_type='" + Cup_type + '\'' +
                ", type='" + type + '\'' +
                ", condition=" + condition +
                '}';
    }
}