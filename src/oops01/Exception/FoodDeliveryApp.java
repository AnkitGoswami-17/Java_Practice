package oops01.Exception;

public class FoodDeliveryApp {
    public static void main(String[] args) {

        OrderController controller = new OrderController();

        // ✅ Valid customer
        System.out.println("=== GET CUSTOMER ===");
        System.out.println(controller.getCustomer("C001"));

        // ❌ Customer not found
        System.out.println("\n=== CUSTOMER NOT FOUND ===");
        System.out.println(controller.getCustomer("C999"));

        // ✅ Valid order
        System.out.println("\n=== GET ORDER ===");
        System.out.println(controller.getOrder("ORD001"));

        // ❌ Order not found
        System.out.println("\n=== ORDER NOT FOUND ===");
        System.out.println(controller.getOrder("ORD999"));

        // ✅ Place order — open restaurant
        System.out.println("\n=== PLACE ORDER ===");
        System.out.println(controller.placeOrder("Swiggy", "Burger", 199.0));

        // ❌ Place order — closed restaurant
        System.out.println("\n=== RESTAURANT CLOSED ===");
        System.out.println(controller.placeOrder("KFC", "Zinger", 250.0));
    }
}


