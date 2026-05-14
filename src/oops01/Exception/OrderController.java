package oops01.Exception;

public class OrderController {

    private OrderService service = new OrderService();

    // Get customer
    public ApiResponse<Customer> getCustomer(String customerId) {
        try {
            Customer customer = service.getCustomer(customerId);
            return new ApiResponse<>(true, "Customer fetched successfully", customer);

        } catch (CustomerNotFoundException e) {
            return new ApiResponse<>(false, e.getMessage(), null);

        } catch (Exception e) {
            return new ApiResponse<>(false, "Something went wrong.", null);
        }
    }

    // Get order
    public ApiResponse<Order> getOrder(String orderId) {
        try {
            Order order = service.getOrder(orderId);
            return new ApiResponse<>(true, "Order fetched successfully", order);

        } catch (OrderNotFoundException e) {
            return new ApiResponse<>(false, e.getMessage(), null);

        } catch (Exception e) {
            return new ApiResponse<>(false, "Something went wrong.", null);
        }
    }

    // Place order
    public ApiResponse<Order> placeOrder(String restaurant,
                                         String item,
                                         double amount) {
        try {
            Order order = service.placeOrder(restaurant, item, amount);
            return new ApiResponse<>(true, "Order placed successfully", order);

        } catch (RestaurantClosedException e) {
            return new ApiResponse<>(false, e.getMessage(), null);

        } catch (Exception e) {
            return new ApiResponse<>(false, "Something went wrong.", null);
        }
    }
}
