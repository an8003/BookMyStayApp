import java.io.*;
import java.util.*;

public class UC12 {

    public static void saveInventory(Map<String,Integer> inventory,String file) throws Exception {

        PrintWriter writer = new PrintWriter(new FileWriter(file));

        for(String key:inventory.keySet())
            writer.println(key+"="+inventory.get(key));

        writer.close();
    }

    public static void loadInventory(String file) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        System.out.println("Loaded Inventory:");

        while((line=br.readLine())!=null)
            System.out.println(line);

        br.close();
    }

    public static void main(String[] args) throws Exception {

        Map<String,Integer> inventory = new HashMap<>();

        inventory.put("Single",5);
        inventory.put("Suite",2);

        saveInventory(inventory,"inventory.txt");
        loadInventory("inventory.txt");
    }
}