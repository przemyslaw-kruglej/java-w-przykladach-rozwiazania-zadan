package zadanie52;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Osoba osoba1 = new Osoba("Jan", "Kowalski", LocalDate.of(1980, 7, 24));
    Osoba osoba2 = new Osoba("Anna", "Nowak", LocalDate.of(1985, 4, 5));
    Osoba osoba3 = new Osoba(null, " ", LocalDate.of(2023, 4, 13));
  }
}