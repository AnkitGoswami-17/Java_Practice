package oops01.Exception;

public class CustomExp {
}
// When order is not found
 class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String orderId) {
        super("Order not found with ID: " + orderId);
    }
}

// When restaurant is closed
 class RestaurantClosedException extends RuntimeException {
    public RestaurantClosedException(String name) {
        super(name + " is currently closed.");
    }
}

// When customer doesn't exist
 class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String customerId) {
        super("Customer not found with ID: " + customerId);
    }
}
