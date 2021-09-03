package roundThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrainBooking {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select -> 1:BookTciket | 2: Show Tickets | 3. Passenger List | 4.exit" );
        Boolean exit = true;

        while(exit) {
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    BookTicket bk = new BookTicket();
                    bk.inputDetails();
                    break;
                case 2:
                    AvailableTickets avtkt = new AvailableTickets();
                    avtkt.toString();
                    break;
                case 3:

                    break;
                case 4:
                    exit=false;
                    break;
            }
        }
    }
}
