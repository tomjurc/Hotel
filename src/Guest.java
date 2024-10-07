import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {
    private String fullName;
    private LocalDate birthdate;

    public Guest(String fullName, LocalDate birthdate){
        this.fullName = fullName;
        this.birthdate = birthdate;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate){
        this.birthdate = birthdate;
    }
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return this.fullName + ", date of birth: " + formatter.format(this.birthdate)+ " ,";
    }
}
