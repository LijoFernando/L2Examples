package roundThree;

import sun.security.jca.GetInstance;

import java.util.*;

public class CancelTicket {
    static Tickets tkt = new Tickets();
    static BookTicket bkTicket = new BookTicket();
    Map<Integer, PassengerInfo> passengerList = bkTicket.getPassengerList();

    public String cancelTicketbyBookID(int bookID) {
        String cancelStatus = "No Records Found";
        if (passengerList != null) {
            PassengerInfo passengerInfo = passengerList.get(bookID);
            if (passengerInfo == null) {
                return "Record Not Found";
            }
            char breth = passengerInfo.getPrebreth();
            tkt.reAllocateTicket(breth);
            passengerInfo.setStatus("Cancelled");
            return "Ticket Cancelled";
        }
        return cancelStatus;
    }

}
