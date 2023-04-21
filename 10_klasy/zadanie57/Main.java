package zadanie57;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Osoba[] osoby = new Osoba[] {
        new Osoba("Adam", "Kowalski", LocalDate.of(1970, 2, 10)),
        new Osoba("Maria", "Nowak", LocalDate.of(1970, 2, 10)),
        new Osoba("Robert", "Strzelecki", LocalDate.of(1990, 5, 24)),
        new Osoba("Jan", "Kowalski", LocalDate.of(1970, 2, 10)),
        new Osoba("joanna", "nowak", LocalDate.of(1970, 2, 10))
    };

    Arrays.sort(osoby);

    for (Osoba osoba : osoby) {
      System.out.println(osoba);
    }
  }
}
