package prac7.task1;

public abstract class Dish {
    protected String type;

    protected Boolean condition;//false

    public void setCondition(Boolean condition) {
        this.condition = condition;
    }

    public Boolean getCondition() {
        return condition;
    }

    public abstract void use();
    public void clean() {
        System.out.println(type + " was washed");
        setCondition(true);
    }


}
