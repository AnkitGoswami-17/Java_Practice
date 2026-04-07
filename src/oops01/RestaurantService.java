package oops01;
import java.util.*;

public class RestaurantService {
    //Bounded Generic Method - only accepts order or its subClass
    public <T extends Order1> ApiResponse<List<T>> getOrders (List<T> orders) {
        if (orders ==  null || orders.isEmpty()) {
            return new ApiResponse<>(false,"No Orders Found", null);
        }
        return new ApiResponse<>(true,"Orders fetched successfully",orders);
    }
    //Generic Method - works for any type
   public <T> ApiResponse<T> getSingleItem(T item, String itemName) {
        if (item ==  null) {
            return new ApiResponse<>(false,itemName + "not Found", null);
        }
        return new ApiResponse<>(true, itemName+" fetched successfully", item);
    }

   //wildcard - print any ApiResponse regardLess of type
    public void logResponse(ApiResponse<?> response) {
        System.out.println("----API LOG----");
        System.out.println("Status : " + (response.isSuccess() ? "SUCCESS" : "FAILED"));
        System.out.println("Message : " + response.getMessage());
        System.out.println("----------------");
    }
}
