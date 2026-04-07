import java.util.*;

public class UC5 {

    static class Reservation {
        String guestName;
        String roomType;

        Reservation(String g,String r) {
            guestName=g;
            roomType=r;
        }
    }

    public static void main(String[] args) {

        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("Alice","Single"));
        queue.add(new Reservation("Bob","Suite"));
        queue.add(new Reservation("Charlie","Double"));

        while(!queue.isEmpty()) {
            Reservation r = queue.poll();
            System.out.println("Processing booking request for "+r.guestName+" -> "+r.roomType);
        }
    }
}