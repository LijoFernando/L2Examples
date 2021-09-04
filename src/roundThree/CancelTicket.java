package roundThree;
import java.util.*;

//enum BrethList {
//    U("upBreth"), L("lwBreth"), M("MidBreth"), R("rAC"), W("wList");
//}
 public class CancelTicket {
    Map<Integer,PassengerInfo> passengerList = bkTickets.getPassengerList();
    Tickets tkt = new Tickets();
    public String cancelTicketbyBookID(int bookID){
        BookTicket bkTickets = new BookTicket();
        String cancelStatus = "No Records Found";

        if (passengerList != null) {
            PassengerInfo passengerInfo = passengerList.get(bookID);
            if(passengerInfo == null){
                return "Record Not Found";
            }
            char breth = passengerInfo.getPrebreth();
            return tkt.reAllocateTicket(breth);
        }
        return cancelStatus;
    }

}
