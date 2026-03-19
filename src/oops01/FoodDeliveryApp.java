package oops01;

interface payable {
    void processPayment(double amount);
    String getPaymentStatus();
    
}

abstract class BasePayment implements payable {
    private String transactionId;
    private String paymentStatus;

    public BasePayment(String transactionId) {
        this.transactionId = transactionId;
        this.paymentStatus = "Pending";
    }

    public void generateReceipt() {
        System.out.println("------------ Receipt --- ---------");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Payment Status: " + paymentStatus);
        System.out.println("---------------------------------");
    }

    @Override
    public String getPaymentStatus() {
        return paymentStatus;
    }

    protected void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public abstract void processPayment(double amount);
}

class UPIPayment extends BasePayment {

    private String upiId;

    public UPIPayment(String transactionId, String upiId) {
        super(transactionId);
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        // Simulate UPI payment processing logic
        System.out.println("Processing UPI payment of $" + amount + " via UPI ID: " + upiId);
        setPaymentStatus("Completed");
    }
}

class CardPayment extends BasePayment {

    private String cardNumber;

    public CardPayment(String transactionId, String cardNumber) {
        super(transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Simulate card payment processing logic
        System.out.println("Processing card payment of $" + amount + " via Card Number: " + cardNumber);
        setPaymentStatus("Completed");
    }
}

class Order {
    private String itemName;
    private double amount;
    private payable payment;

    public Order(String itemName, double amount, payable payment) {
        this.itemName = itemName;
        this.amount = amount;
        this.payment = payment;
    }

    public void placeOrder() {
        System.out.println("Placing order for: " + itemName);
        payment.processPayment(amount);
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {

        //upi order
        UPIPayment upiPayment = new UPIPayment("TXN12345", "ankit@upi");
        Order upiOrder = new Order("Burger", 15.99, upiPayment);
        upiOrder.placeOrder();
        upiPayment.generateReceipt();

        //card order
        CardPayment cardPayment = new CardPayment("TXN67890", "1234-5678-9012-3456");
        Order cardOrder = new Order("Pizza", 25.99, cardPayment);
        cardOrder.placeOrder();
        cardPayment.generateReceipt();
    }
}
