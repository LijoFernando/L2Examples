package roundThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class BookTicket {
    static Map<Integer, PassengerInfo> passengerMap;
    PassengerInfo passInfo = new PassengerInfo();
    GenerateTickets avTkt = new GenerateTickets();
    GenerateTickets generateTickets = new GenerateTickets();

    public void inputDetails() throws Exception {
        passengerMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Details");
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        char prefBreth = (char) br.read();
        String status = "No TicketsAvailable";
        if (avTkt.isAvailable()) {
            status = bookticket(name, age, prefBreth);
        }
        System.out.println(status);
    }

    public String bookticket(String name, int age, char prefbreth) {
        passInfo.setBookID(generateTickets.getBookID());
        passInfo.setName(name);
        passInfo.setAge(age);
        passInfo.setPrebreth(avTkt.allotBreth(prefbreth));
        char alotedBreath = passInfo.getPrebreth();
        passInfo.setAllotedBreth(avTkt.allotSeat(alotedBreath));
        passInfo.setStatus(avTkt.getStatus(alotedBreath));
        int bookID = passInfo.getBookID();
        passengerMap.put(bookID, passInfo);
        return passengerMap.get(bookID).toString();
    }

    public Map getPassengerList() {
        if (!passengerMap.isEmpty()) {
            return passengerMap;
        }
        return null;
    }
}

