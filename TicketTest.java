//class ticketbooking and creaate 3 more classes of train ticket,bus ticket and flight ticket which inherits class ticket booking and create a mothod in all classes of check ticket and print the ticket using method overriding
class TicketBooking {
    public void checkTicket() {
        System.out.println("Checking generic ticket...");
    }
}

class TrainTicket extends TicketBooking {
    public void checkTicket() {
        System.out.println("Train Ticket:\nTrain No: 12345\nSeat: A1\nStatus: Confirmed\n");
    }
}

class BusTicket extends TicketBooking {
    public void checkTicket() {
        System.out.println("Bus Ticket:\nBus No: KA-09-1234\nSeat: 12B\nStatus: Confirmed\n");
    }
}

class FlightTicket extends TicketBooking {
   
    public void checkTicket() {
        System.out.println("Flight Ticket:\nFlight No: AI202\nSeat: 18C\nStatus: Confirmed\n");
    }
}

public class TicketTest {
    public static void main(String[] args) {
        TicketBooking train = new TrainTicket();
        TicketBooking bus = new BusTicket();
        TicketBooking flight = new FlightTicket();

        train.checkTicket();
        bus.checkTicket();
        flight.checkTicket();
    }
}
