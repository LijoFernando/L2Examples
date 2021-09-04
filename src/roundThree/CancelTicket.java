package roundThree;

import sun.security.jca.GetInstance;

import java.util.*;

public class CancelTicket {
    Tickets tkt = new Tickets();
    BookTicket bkTicket =new BookTicket();
    Map<Integer, PassengerInfo> passengerList = bkTicket.getPassengerList();

    public String cancelTicketbyBookID(int bookID) {
        BookTicket bkTickets = new BookTicket();
        String cancelStatus = "No Records Found";

        if (passengerList != null) {
            PassengerInfo passengerInfo = passengerList.get(bookID);
            if (passengerInfo == null) {
                return "Record Not Found";
            }
            char breth = passengerInfo.getPrebreth();
            return tkt.reAllocateTicket(breth);
        }
        return cancelStatus;
    }

}
