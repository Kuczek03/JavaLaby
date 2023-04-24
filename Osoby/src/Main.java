import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        Osoba osoba = new Osoba(230494100, LocalDate.of(2023,4,17),"Kowal","Jan", "Kazimierz");
        System.out.println(osoba.toString());
    }
}
