import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,true,BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,true,BigDecimal.valueOf(2400));
        Guest guest1 = new Guest("Adela Malikova", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan Dvoracek",LocalDate.of(1995,4,5));
        guest2.setBirthdate(LocalDate.of(1995,5,5));
        System.out.println(guest1);
        System.out.println(guest2);
        Booking booking1 = new Booking(guest1, room, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26));
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        Booking booking2 = new Booking(guests, room3, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));
        BookingManager manager = new BookingManager();
        manager.addBooking(booking1);
        manager.addBooking(booking2);
        System.out.println(manager);
    }
}