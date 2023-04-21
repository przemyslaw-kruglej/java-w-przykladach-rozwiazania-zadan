package zadanie62;

import java.math.BigDecimal;
import java.util.Objects;

public record Produkt(String nazwa, BigDecimal cena) {
  public Produkt {
    Objects.requireNonNull(nazwa, "Nazwa jest wymagana.");
    Objects.requireNonNull(cena, "Cena jest wymagana.");
    if (cena.compareTo(BigDecimal.ZERO) <= 0) {
      throw new IllegalArgumentException(
          "Cena musi być większa niż zero."
      );
    }
  }
}
