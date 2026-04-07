class BookingTask implements Runnable {

    String guest;

    BookingTask(String g){
        guest=g;
    }

    public void run() {

        synchronized(this) {
            System.out.println(guest+" booking processed by "+Thread.currentThread().getName());
        }
    }
}

public class UC11 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new BookingTask("Alice"));
        Thread t2 = new Thread(new BookingTask("Bob"));
        Thread t3 = new Thread(new BookingTask("Charlie"));

        t1.start();
        t2.start();
        t3.start();
    }
}