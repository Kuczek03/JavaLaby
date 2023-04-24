import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;


public class Osoba {
    private String nazwisko;
    private ArrayList<String> imiona;
    private int pesel;
    private LocalDate dataurodz;
    public Osoba(int pesel,LocalDate dataurodz, String nazwisko, String...  imiona){
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.dataurodz = dataurodz;
        this.imiona = new ArrayList<>();
        this.imiona.addAll(Arrays.asList(imiona));
    }
    public String toString() {
        return "Pesel" + this.pesel + "dataurodz" + this.dataurodz + "Nazwisko" + this.nazwisko + "Imiona" + this.imiona;
    }


}
