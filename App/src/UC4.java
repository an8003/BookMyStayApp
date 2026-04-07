import java.util.*;

public class UC4 {

    public static void searchAvailableRooms(Map<String,Integer> inventory) {

        System.out.println("Available Rooms:");

        for(String roomType : inventory.keySet()) {
            int count = inventory.get(roomType);

            if(count > 0) {
                System.out.println(roomType + " -> " + count + " rooms available");
            }
        }
    }

    public static void main(String[] args) {

        Map<String,Integer> inventory = new HashMap<>();

        inventory.put("Single",5);
        inventory.put("Double",0);
        inventory.put("Suite",3);

        searchAvailableRooms(inventory);
    }
}