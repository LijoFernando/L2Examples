package roundThree;

import java.util.*;


public class Tickets {

    static Map<String, Integer> map = new HashMap<>();

    public static void loadTickets() {
        map.put("upBreth", 21);
        map.put("midBreth", 21);
        map.put("lwBreth", 21);
        map.put("rAC", 16);
        map.put("wList", 10);
        map.put("ticketNo", 0);
    }

    public static Map getAllTicketsCount() {
        if (map.isEmpty()) {
            loadTickets();
        }
        return map;
    }

    public String reAllocateTicket(char breth) {
        return "Rellocated";
    }

    public void getTicketsCount() {
        System.out.println(Tickets.getAllTicketsCount().entrySet());
    }

}
