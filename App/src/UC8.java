import java.util.*;

public class UC8 {

    static class Reservation {
        String guest;
        String room;

        Reservation(String g,String r){
            guest=g;
            room=r;
        }
    }

    public static void main(String[] args) {

        List<Reservation> history = new ArrayList<>();

        history.add(new Reservation("Alice","Single"));
        history.add(new Reservation("Bob","Suite"));

        System.out.println("Booking History:");

        for(Reservation r : history) {
            System.out.println(r.guest+" booked "+r.room);
        }
    }
}