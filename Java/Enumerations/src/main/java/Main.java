import coffee.Bill;
import coffee.CoffeeType;
import coffee.Order;

public class Main {

    public static void main(String[] args) {

        Order newOrder = new Order(CoffeeType.ESPRESSO, 2);
        Bill myBill = new Bill(newOrder);
        System.out.println(myBill);

        System.out.println(CoffeeType.values()[1]);
        System.out.println(CoffeeType.valueOf("ESPRESSO"));
        System.out.println(CoffeeType.AMERICANO.ordinal());
    }
}
