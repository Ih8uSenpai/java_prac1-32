package prac7.task3;

public class Chair extends Furniture implements purchasable{
    public Chair() {
        super("Chair", "Pine", 1000, 10, 123456);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean is_available(int amount) {
        if(this.amount < amount) {
            System.out.println("Error: Amount of available product: " + this.amount);
            return false;
        }
        return true;
    }

    @Override
    public int getID() {
        return ID;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
