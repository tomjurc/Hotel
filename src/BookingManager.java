import java.util.ArrayList;

public class BookingManager {
    private ArrayList<Booking> bookings;

    BookingManager(){
        this.bookings = new ArrayList<>();
    }

    public boolean addBooking(Booking booking){
        return this.bookings.add(booking);
    }

    public boolean removeBooking(Booking booking){
        return this.bookings.remove(booking);
    }

    public String toString() {
        if (!this.bookings.isEmpty()) {
            StringBuilder bookingsString = new StringBuilder();
            for (Booking booking : this.bookings) {
                bookingsString.append(booking + "\n");
            }
            return bookingsString.toString();
        }
        return "The hotel has no reservations.";
    }
}
