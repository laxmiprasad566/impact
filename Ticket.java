//ticket booking class, journey method destination,date,no.passengers
class ticketBooking
{
    int fare;
    void journey(String dest)
    {
        System.out.println("Your destination is "+dest);
    }

    void journey(String dest,String date)
    {
        System.out.println("Your destination is "+dest);
        System.out.println("Dated on "+date);
    }

    void journey(String dest,String date,int pass)
    {
        System.out.println("Your destination is "+dest);
        System.out.println("Dated on "+date);
        System.out.println("No. of passengers "+pass);
        fare = pass * 20;
        System.out.println("The fare is "+fare);
    }
}
class Ticket{
    public static void main(String[] args)
    {
        ticketBooking ticket = new ticketBooking();
        ticket.journey("Delhi");
        ticket.journey("Delhi","31-05-25");
        ticket.journey("Delhi","31-05-25",2);
        
    }
}