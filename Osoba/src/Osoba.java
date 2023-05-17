import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


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
    public Osoba(){
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setImiona(ArrayList<String> imiona) {
        this.imiona = imiona;
    }
    public ArrayList<String> getImiona() {
        return imiona;
    }
    public int getPESEL() {
        return pesel;
    }
    public void setPESEL(int pesel) {
        this.pesel = pesel;
    }
    public LocalDate getDataurodz() {
        return dataurodz;
    }
    public void setDataurodz(LocalDate dataurodz) {
        this.dataurodz = dataurodz;
    }
    public static Osoba wprowadz(){
        Scanner scanner = new Scanner(System.in);
        Osoba czlowiek = new Osoba();
        System.out.println("Wprowadź nową osobę");
        System.out.print("Wprowadź nazwisko: ");
        czlowiek.setNazwisko(scanner.next());
        System.out.print("Wprowadz imię 1: ");
        String pierwszeImie= scanner.next();
        System.out.print("Wprowadź imie 2: ");
        String drugieImie = scanner.next();
        czlowiek.setImiona(new ArrayList<String>(Arrays.asList(pierwszeImie,drugieImie)));
        System.out.print("Wprowadź PESEL: ");
        czlowiek.setPESEL(scanner.nextInt());
        System.out.print("Podaj date (dd-mm-rrrr): ");
        String data = scanner.next();
        String[] dataArray = data.split("-");
        czlowiek.setDataurodz(LocalDate.of(Integer.parseInt(dataArray[2]),Integer.parseInt(dataArray[1]),Integer.parseInt(dataArray[0])));
        return czlowiek;
    }
    public String toString() {
        return "{nazwisko:" + nazwisko
                + ", imie_1:" + imiona.get(0) + ", imie_2:" + imiona.get(1)
                + ", PESEL:" + pesel
                + ", ur.:" + dataurodz + "}";
    }


}
