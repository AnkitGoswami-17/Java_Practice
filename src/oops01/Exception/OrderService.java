package oops01.Exception;
import java.util.*;

public class OrderService {

    // Fake database
    private Map<String, Customer> customers = new HashMap<>();
    private Map<String, Order> orders = new HashMap<>();
    private Set<String> closedRestaurants = new HashSet<>();

    // Constructor — seed some data
    public OrderService() {
        customers.put("C001", new Customer("C001", "Ankit"));
        customers.put("C002", new Customer("C002", "Rahul"));

        orders.put("ORD001", new Order("ORD001", "Biryani", 350.0));
        orders.put("ORD002", new Order("ORD002", "Pizza", 520.0));

        closedRestaurants.add("KFC");
        closedRestaurants.add("Dominos");
    }

    // Fetch customer — throws if not found
    public Customer getCustomer(String customerId) {
        Customer customer = customers.get(customerId);

        if (customer == null) {
            throw new CustomerNotFoundException(customerId);
        }
        return customer;
    }

    // Fetch order — throws if not found
    public Order getOrder(String orderId) {
        Order order = orders.get(orderId);

        if (order == null) {
            throw new OrderNotFoundException(orderId);
        }
        return order;
    }

    // Place order — throws if restaurant closed
    public Order placeOrder(String restaurantName, String item, double amount) {
        if (closedRestaurants.contains(restaurantName)) {
            throw new RestaurantClosedException(restaurantName);
        }

        String newOrderId = "ORD00" + (orders.size() + 1);
        Order newOrder = new Order(newOrderId, item, amount);
        orders.put(newOrderId, newOrder);
        return newOrder;
    }
}

