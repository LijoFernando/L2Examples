package roundThree;
import java.util.*;

public class AvailableTickets {
    Map <String , Integer> ticketsMap = Tickets.getAllTicketsCount();
    private int upBreth = ticketsMap.get("upBreth");
    private int midBreth = ticketsMap.get("midBreth");
    private int lwBreth = ticketsMap.get("lwBreth");
    private int rAC = ticketsMap.get("rAC");
    private int wList = ticketsMap.get("wList");
    private int ticketNo =0;

    public boolean isAvailable(){
        if (upBreth ==0 && midBreth == 0 && lwBreth == 0 && rAC == 0 && wList == 0 ) {
            return false;
        }
        return true;
    }
    public char brethFull(char prebreth){
        if (lwBreth == 0 && upBreth == 0 && midBreth==0) {
            return 'R';
        }
        return prebreth;
    }

    public int getBookID(){
        int bookID =  (int)(Math.random()* 100000);
        return bookID;
    }
    public void ticketReduce(String breth) {
        ticketsMap.put( breth, ticketsMap.get(breth)-1);
    }

    public String allotBreth(char prebreth){
        char pb = brethFull(prebreth);
        switch(pb) {
            case 'L': if(lwBreth != 0) {
                        pb ='L';
                        ticketReduce("lwBreth");
                        ++ticketNo;
                        break;
                      }
                      allotBreth('U');
                       break;
            case 'U': if (upBreth != 0) {
                        pb='U';
                        ticketReduce("upBreth");
                        ++ticketNo;
                        break;
                      }
                    allotBreth('M');
                    break;
            case 'M': if ( midBreth != 0) {
                            pb='M';
                            ticketReduce("midBreth");
                         ++ticketNo;
                         break;
                     }
                    allotBreth('L');
                    break;

            //no tickets in Lower, Middle and Upper
            case 'R': if(rAC!=0){
                        pb='R';
                        ticketReduce("rRC");
                        ++ticketNo;
                        break;
                        }
                        allotBreth('W');
                        break;
            case 'W':   pb='W';
                        ticketReduce("wList");
                        ++ticketNo;
                        break;
        }

        return pb+""+ticketNo;
    }

    @Override
    public String toString(){
        return "Available:"+upBreth+midBreth+lwBreth+"RAC:"+rAC;
    }
}
