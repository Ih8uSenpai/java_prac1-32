package prac7.task2;

class Wolf extends Dog {
    @Override
    public String bark() {
        return ("Wooooo wooooooo");
    }

    public Wolf() {
        super("Common wolf", 60, "gray");
        this.isAggressive = true;
    }
}