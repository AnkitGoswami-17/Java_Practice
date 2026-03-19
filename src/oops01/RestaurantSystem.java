package oops01;
import java.util.*;

public class RestaurantSystem {
    public static void main(String[] args) {

        //Restaurant->Category->Items
        Map<String,Map<String,List<String>>> restaurantMenu = new HashMap<>();

        //--KFC Menu--
        Map<String,List<String>> kfcMenu = new HashMap<>();
        kfcMenu.put("Snacks", new ArrayList<>());
        kfcMenu.get("Snacks").add("Popcorn Chicekn");
        kfcMenu.get("Snacks").add("Chicken Wings");

        kfcMenu.put("Mains", new ArrayList<>());
        kfcMenu.get("Mains").add("Zinger Burger");
        kfcMenu.get("Mains").add("Chicken Bucket");

        restaurantMenu.put("KFC",kfcMenu);

        //--Dominos Menu--
        Map<String,List<String>> dominosMenu = new HashMap<>();
        dominosMenu.put("Pizza", new ArrayList<>());
        dominosMenu.get("Pizza").add("Margherita");
        dominosMenu.get("Pizza").add("Pepperoni");

        dominosMenu.put("Sides", new ArrayList<>());
        dominosMenu.get("Sides").add("Garlic Bread");
        dominosMenu.get("Sides").add("Cheesy Dip");

        restaurantMenu.put("Dominos",dominosMenu);

        System.out.println("===== FULL MENU =====");

        restaurantMenu.forEach((restaurant,menu) -> {
            System.out.println("\n " + restaurant);
            menu.forEach((category,items)->{
                System.out.println("Cat: " + category);

                for(String item : items) {
                    System.out.println("     . " + item);
                }
            });
        });

        Map<String, List<String>> customerOrders = new HashMap<>();

        //C001 places order
        customerOrders.put("C001", new ArrayList<>());
        customerOrders.get("C001").add("Zinger Burger");
        customerOrders.get("C001").add("Chicken Bucket");

        //C002 places order
        customerOrders.put("C002", new ArrayList<>());
        customerOrders.get("C002").add("Margherita");

        //C001 places order again, list already present just need to add the item
        customerOrders.get("C001").add("Pepperoni");


        System.out.println("\n======= CUSTOMER ORDER =======");

        for(Map.Entry<String,List<String>> entry : customerOrders.entrySet()) {
            String customerId = entry.getKey();
            List<String> orders = entry.getValue();

            //or for(String order : entry.getValue()) {
            //System.out.println("order "+ order);
            // }
            //or entry.getValue().forEach(order -> sout("order " + order));

            System.out.println("\n Customer: " + customerId);
            for(String order : orders) {
                System.out.println(" Order " + order);
            }
        }

        //all unique cuisines across all restaurants
            Set<String> uniqueCuisines = new HashSet<>();

            uniqueCuisines.add("Indian");
            uniqueCuisines.add("Chinese");
            uniqueCuisines.add("American");
            uniqueCuisines.add("Indian"); //duplicate will be ignored
            uniqueCuisines.add("Chinese"); //duplicate will be ignored

            System.out.println("\n==== UNIQUE CUISINES ====");
            for(String cuisine : uniqueCuisines) {
                System.out.println(" cusisine: " + cuisine);
            }

            System.out.println("Total Unique Cuisine = "+ uniqueCuisines.size());

            //orders come in - process in order resolved
        Queue<String> kitchenQueue = new LinkedList<>();
            kitchenQueue.offer("C001 - Zinger Burger");
            kitchenQueue.offer("C002 - Margherita");
            kitchenQueue.offer("C001 - Pepperoni");

        System.out.println("\n===== KITCHEN QUEUE =====");
        System.out.println("Next Up: " + kitchenQueue.peek());

        while (!kitchenQueue.isEmpty()) {
            String order = kitchenQueue.poll();
            System.out.println("Preparing : " + order);
        }
    }

}
