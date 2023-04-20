package zadanie61;

import java.time.LocalDate;
import java.util.Objects;

public record Samochod(
    String marka,
    int rokProdukcji,
    int maksymalnaSzybkosc
) {
  public Samochod {
    Objects.requireNonNull(marka, "Marka jest wymagana.");
    if (rokProdukcji > LocalDate.now().getYear()) {
      throw new IllegalArgumentException(
          "Rok produkcji nie może być w przyszłości."
      );
    }
    if (maksymalnaSzybkosc <= 0) {
      throw new IllegalArgumentException(
          "Maksymalna szybkość musi być większa od zera."
      );
    }
  }
}
