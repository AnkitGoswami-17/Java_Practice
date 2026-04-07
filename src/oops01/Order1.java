package oops01;

public class Order1 {
    private String orderId;
    private String item;
    private double amount;


    public Order1(String orderId, String item, double amount) {
        this.orderId = orderId;
        this.item = item;
        this.amount = amount;
    }

    public String toString() {
        return "order{Id='"+orderId + "', item='" + item + "',amount=" + amount + "}";
    }

}
