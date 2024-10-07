import java.math.BigDecimal;

public class Room {
    private int id;
    private int numOfBeds;
    public boolean hasBalcony;
    public boolean hasOceanView;
    public BigDecimal price;

    public Room(int id, int numOfBeds, boolean hasBalcony, boolean hasOceanView, BigDecimal price){
        this.id = id;
        this.numOfBeds = numOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasOceanView = hasOceanView;
        this.price = price;
    }

    public String toString(){
        return "room number: " +this.id + ", number of beds: " + this.numOfBeds + ", price per night: " + this.price+ (this.hasBalcony?  ", has balcony,":", no balcony,") + (this.hasOceanView? " has ocean view":" no ocean view");
    }
}
