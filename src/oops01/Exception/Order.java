package oops01.Exception;

public class Order {
    private String orderId;
    private String item;
    private double amount;

    public Order(String orderId, String item, double amount) {
        this.orderId = orderId;
        this.item = item;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{id='" + orderId +
                "', item='" + item +
                "', amount=₹" + amount + "}";
    }
}
