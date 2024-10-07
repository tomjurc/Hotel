import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Booking {
    private ArrayList<Guest> guests = new ArrayList<>();
    private Room room;
    private LocalDate startOfStay;
    private LocalDate endOfStay;
    private TypeOfStay typeOfTrip;

    public Booking (Guest guest, Room room, TypeOfStay typeOfTrip){
        this.guests.add(guest);
        this.room = room;
        this.typeOfTrip = typeOfTrip;
        this.startOfStay = LocalDate.now();
        this.endOfStay = this.startOfStay.plusDays(6);
    }
    public Booking(Guest guest,Room room, LocalDate startOfStay, LocalDate endOfStay, TypeOfStay typeOfTrip){
        this.guests.add(guest);
        this.room = room;
        this.startOfStay = startOfStay;
        this.endOfStay = endOfStay;
        this.typeOfTrip = typeOfTrip;

    }
    public Booking(ArrayList<Guest>guests,Room room, LocalDate startOfStay, LocalDate endOfStay,TypeOfStay typeOfTrip){
        this.guests.addAll(guests);
        this.room = room;
        this.startOfStay = startOfStay;
        this.endOfStay = endOfStay;
        this.typeOfTrip = typeOfTrip;
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
        this.guests.forEach(guestInfo::append);
        /*for(Guest guest : this.guests){
            guestInfo.append(guest+" ,");
        }*/
        return guestInfo  + this.room.toString() +", type of trip: " + typeOfTrip.getStay() +", date of stay: " + formatter.format(this.startOfStay)+ " - " + formatter.format(this.endOfStay)+".";
    }
}
