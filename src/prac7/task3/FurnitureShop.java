package prac7.task3;

import java.util.ArrayList;

public class FurnitureShop {
    private String name;
    private ArrayList<purchasable> products = new ArrayList<purchasable>();

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void add_product(purchasable product){
        products.add(product);
    }
    public void show_price_list(){
        System.out.println("PRICE LIST:");
        for (purchasable el : products){
            System.out.println(el.toString());
        }
        System.out.println();
    }
    public void buy(int amount, int ID) {
        for (purchasable el : products)
            if (el.getID() == ID && el.is_available(amount)) {
                el.setAmount(el.getAmount() - amount);
                System.out.println("purchase successfully completed!");
            }
    }
}
