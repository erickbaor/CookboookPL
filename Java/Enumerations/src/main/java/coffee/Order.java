package coffee;

public class Order {

    private CoffeeType coffee;
    private Integer amount;

    public Order(CoffeeType coffee, Integer amount) {
        this.coffee = coffee;
        this.amount = amount;
    }

    public CoffeeType getCoffee() {
        return coffee;
    }

    public void setCoffee(CoffeeType coffee) {
        this.coffee = coffee;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
