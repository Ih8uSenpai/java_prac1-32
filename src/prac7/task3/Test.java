package prac7.task3;

public class Test {
    public static void main(String [] args){
        FurnitureShop shop = new FurnitureShop("XfshopX");
        Chair chair = new Chair();
        Table table = new Table();
        shop.add_product(chair);
        shop.add_product(table);
        shop.show_price_list();

        shop.buy(6, 123456);
        shop.buy(6, 654321);
        shop.buy(3, 654321);
        shop.show_price_list();
    }
}
