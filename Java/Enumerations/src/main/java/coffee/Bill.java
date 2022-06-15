package coffee;

public class Bill {

    private Order order;

    public Bill(Order order) {
        this.order = order;
    }

    public double value() {
        double value = 500;
        if (order.getCoffee().equals(CoffeeType.AMERICANO))
            value = order.getAmount() * 500;
        if (order.getCoffee().equals(CoffeeType.CAPPUCCHINO))
            value = order.getAmount() * 700;
        if (order.getCoffee().equals(CoffeeType.DOPPIO))
            value = order.getAmount() * 300;
        if (order.getCoffee().equals(CoffeeType.ESPRESSO))
            value = order.getAmount() * 1000;

        return value;
    }

    @Override
    public String toString() {
        return "Bill: $"+value()+" COP";
    }
}
