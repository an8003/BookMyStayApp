import java.util.*;

public class UC10 {

    public static void main(String[] args) {

        Stack<String> rollbackStack = new Stack<>();

        rollbackStack.push("Room101");
        rollbackStack.push("Room102");

        System.out.println("Cancelling booking...");

        String releasedRoom = rollbackStack.pop();

        System.out.println("Released Room: "+releasedRoom);
    }
}