import java.util.*;

public class UC7 {

    static class Service {
        String name;
        int cost;

        Service(String n,int c){
            name=n;
            cost=c;
        }
    }

    public static void main(String[] args) {

        Map<String,List<Service>> reservationServices = new HashMap<>();

        List<Service> services = new ArrayList<>();

        services.add(new Service("Breakfast",500));
        services.add(new Service("Spa",1200));

        reservationServices.put("RES101",services);

        int total=0;

        for(Service s : reservationServices.get("RES101")) {
            total+=s.cost;
            System.out.println("Service: "+s.name+" Cost:"+s.cost);
        }

        System.out.println("Total Add-on Cost: "+total);
    }
}