//class TicketPriceCalculator with method calculatePrice() create child classes 1.EconomyClasss  calculatePrice() 2.BusinessClasss  calculatePrice() 3.1stClasss  calculatePrice() implement price modifers based on seat class,passengerr age,booking date
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class TicketPriceCalculator {
    double basePrice = 1000.0;

    public double calculatePrice(int age, LocalDate travelDate, LocalDate bookingDate) {
        return basePrice;
    }
}

class EconomyClass extends TicketPriceCalculator {
    public double calculatePrice(int age, LocalDate travelDate, LocalDate bookingDate) {
        double price = basePrice;
        price *= 1.0; 
        if (age < 12) price *= 0.5;
        else if (age > 60) price *= 0.7;

        long daysInAdvance = ChronoUnit.DAYS.between(bookingDate, travelDate);
        if (daysInAdvance > 30) price *= 0.9;
        else if (daysInAdvance < 5) price *= 1.1;

        return price;
    }
}

class BusinessClass extends TicketPriceCalculator {
    public double calculatePrice(int age, LocalDate travelDate, LocalDate bookingDate) {
        double price = basePrice * 1.5;

        if (age < 12) price *= 0.5;
        else if (age > 60) price *= 0.8;

        long daysInAdvance = ChronoUnit.DAYS.between(bookingDate, travelDate);
        if (daysInAdvance > 30) price *= 0.95;
        else if (daysInAdvance < 5) price *= 1.15;

        return price;
    }
}

class FirstClass extends TicketPriceCalculator {

    public double calculatePrice(int age, LocalDate travelDate, LocalDate bookingDate) {
        double price = basePrice * 2.0;

        if (age < 12) price *= 0.6;
        else if (age > 60) price *= 0.85;

        long daysInAdvance = ChronoUnit.DAYS.between(bookingDate, travelDate);
        if (daysInAdvance > 30) price *= 0.97;
        else if (daysInAdvance < 5) price *= 1.2;

        return price;
    }
}

public class TicketPricingTest {
    public static void main(String[] args) {
        LocalDate travelDate = LocalDate.of(2025, 7, 15);
        LocalDate bookingDate = LocalDate.of(2025, 6, 1);
        int age = 65;

        TicketPriceCalculator economy = new EconomyClass();
        TicketPriceCalculator business = new BusinessClass();
        TicketPriceCalculator first = new FirstClass();

        System.out.println("Economy Class Price: ₹" + economy.calculatePrice(age, travelDate, bookingDate));
        System.out.println("Business Class Price: ₹" + business.calculatePrice(age, travelDate, bookingDate));
        System.out.println("First Class Price: ₹" + first.calculatePrice(age, travelDate, bookingDate));
    }
}
