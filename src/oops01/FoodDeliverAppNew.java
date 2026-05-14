package oops01;
import java.util.*;

public class FoodDeliverAppNew {
    public static void main(String[] args) {

        RestaurantService service = new RestaurantService();

        //fetch list of all orders
        List<Order1> orderList = new ArrayList<>();
        orderList.add(new Order1("ORD001","Biryani",350.0));
        orderList.add(new Order1("ORD002","Pizza",520.0));
        orderList.add((new Order1("ORD003","Burger", 199.0)));

        ApiResponse<List<Order1>> ordersResponse = service.getOrders(orderList);
        System.out.println("#ORDER LIST RESPONSE#");
        System.out.println(ordersResponse);

        //log it using wildcard method
        service.logResponse(ordersResponse);

        //fetch single customer
        Customer customer = new Customer("C001","Ankit");

        ApiResponse<Customer> customerResponse = service.getSingleItem(customer,"Customer");
        System.out.println(customerResponse);
        service.logResponse(customerResponse);

        //empty order list
        List<Order1> emptyList = new ArrayList<>();

        ApiResponse<List<Order1>> emptyResponse = service.getOrders(emptyList);
        System.out.println("\n ==EMPTY ORDER RESPONSE==");
        System.out.println(emptyResponse);

        service.logResponse(emptyResponse);
    }
}
