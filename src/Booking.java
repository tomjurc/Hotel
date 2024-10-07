import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Booking {
    private ArrayList<Guest> guests = new ArrayList<>();
    private Room room;
    private LocalDate startOfStay;
    private LocalDate endOfStay;
    private boolean holiday;
    private boolean workTrip;

    public Booking(Guest guest,Room room, LocalDate startOfStay, LocalDate endOfStay){
        this.guests.add(guest);
        this.room = room;
        this.startOfStay = startOfStay;
        this.endOfStay = endOfStay;
        this.holiday = false;
        this.workTrip = false;
    }
    public Booking(ArrayList<Guest>guests,Room room, LocalDate startOfStay, LocalDate endOfStay){
        guests.stream().forEach(guest -> this.guests.add(guest));
        this.room = room;
        this.startOfStay = startOfStay;
        this.endOfStay = endOfStay;
    }
    public boolean addGuest(Guest guest){
        return this.guests.add(guest);
    }

    public boolean removeGuest(Guest guest){
        return this.guests.remove(guest);
    }
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        StringBuilder guestInfo = new StringBuilder();
        for(Guest guest : this.guests){
            guestInfo.append(guest+" ,");
        }
        return guestInfo.toString() + this.room.toString() +", date of stay: " + formatter.format(this.startOfStay)+ " - " + formatter.format(this.endOfStay)+".";
    }
}
