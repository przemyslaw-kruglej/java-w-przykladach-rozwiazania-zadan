package zadanie51;

import java.time.LocalDate;

public record Osoba(String imie, String nazwisko, LocalDate dataUrodzin) {
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
}
