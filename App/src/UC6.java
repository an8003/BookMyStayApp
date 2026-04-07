import java.util.*;

public class UC6 {

    public static void main(String[] args) {

        Map<String,Integer> inventory = new HashMap<>();
        inventory.put("Single",2);
        inventory.put("Double",1);

        Map<String,Set<String>> allocatedRooms = new HashMap<>();

        allocateRoom("Single",inventory,allocatedRooms);
        allocateRoom("Single",inventory,allocatedRooms);
        allocateRoom("Double",inventory,allocatedRooms);
    }

    static void allocateRoom(String roomType,
                             Map<String,Integer> inventory,
                             Map<String,Set<String>> allocatedRooms){

        int count = inventory.getOrDefault(roomType,0);

        if(count>0){

            String roomId = roomType + "-" + UUID.randomUUID().toString().substring(0,4);

            allocatedRooms.putIfAbsent(roomType,new HashSet<>());
            allocatedRooms.get(roomType).add(roomId);

            inventory.put(roomType,count-1);

            System.out.println("Room Allocated: "+roomId);
        }
        else
            System.out.println("No rooms available");
    }
}