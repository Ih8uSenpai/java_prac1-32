package prac7.task3;

public class Table extends Furniture implements purchasable{
    public Table() {
        super("Table", "Oak", 3000, 5, 654321);
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
