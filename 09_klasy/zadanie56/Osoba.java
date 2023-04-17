package zadanie56;

import java.time.LocalDate;

public record Osoba(
    String imie, String nazwisko, LocalDate dataUrodzin
) implements Comparable<Osoba> {

  public Osoba(String imie, String nazwisko, LocalDate dataUrodzin) {
    StringBuilder bledyWalidacji = new StringBuilder();

    if (imie == null || imie.isBlank()) {
      bledyWalidacji.append("Imię jest wymagane.\n");
    }
    if (nazwisko == null || nazwisko.isBlank()) {
      bledyWalidacji.append("Nazwisko jest wymagane.\n");
    }
    if (dataUrodzin == null) {
      bledyWalidacji.append("Data urodzin jest wymagana.\n");
    } else if (dataUrodzin.isAfter(LocalDate.now())) {
      bledyWalidacji.append("Data urodzin nie może być w przyszłości.\n");
    }

    if (!bledyWalidacji.isEmpty()) {
      throw new IllegalArgumentException(
          "Nieprawidłowe dane osoby:\n" + bledyWalidacji
      );
    }

    this.imie = imie;
    this.nazwisko = nazwisko;
    this.dataUrodzin = dataUrodzin;
  }

  @Override
  public int compareTo(Osoba o) {
    int wynik = dataUrodzin.compareTo(o.dataUrodzin);

    if (wynik == 0) {
      wynik = String.CASE_INSENSITIVE_ORDER.compare(nazwisko, o.nazwisko);

      if (wynik == 0) {
        return String.CASE_INSENSITIVE_ORDER.compare(imie, o.imie);
      }
    }

    return wynik;
  }
}
