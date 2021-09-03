package roundThree;
import java.util.*;

public class Tickets {
    static Map <String, Integer > map = new HashMap<>();

    public static void loadTickets(){
        map.put("upBreth", 0);
        map.put("midBreth",0);
        map.put("lwBreth",0);
        map.put("rAC",0);
        map.put("wList",0);
    }

    public static Map getAllTicketsCount(){
        if(map.isEmpty()){
            loadTickets();
        }
        return map;
    }

    public void getTicketsCount() {
        System.out.println(Tickets.getAllTicketsCount().entrySet());
    }

}
