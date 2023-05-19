package zadanie53;

import java.util.Objects;

public record Adres(
    Ulica ulica,
    NumerDomu numerDomu,
    NumerMieszkania numerMieszkania,
    KodPocztowy kodPocztowy,
    Miejscowosc miejscowosc
) {
  public Adres {
    Objects.requireNonNull(ulica, "Ulica jest wymagana.");
    Objects.requireNonNull(numerDomu, "Numer domu jest wymagany.");
    Objects.requireNonNull(
        kodPocztowy, "Kod pocztowy jest wymagany."
    );
    Objects.requireNonNull(
        miejscowosc, "Miejscowosc jest wymagana."
    );
  }
}

record Ulica(String wartosc) {
  public Ulica {
    Objects.requireNonNull(
        wartosc, "Wartość dla ulicy jest wymagana."
    );
  }
}

record NumerDomu(String numerDomu) {
  public NumerDomu {
    Objects.requireNonNull(
        numerDomu, "Wartość dla numeru domu jest wymagana."
    );
  }
}

record NumerMieszkania(int wartosc) {}

record KodPocztowy(String wartosc) {
  public KodPocztowy {
    Objects.requireNonNull(
        wartosc, "Wartość dla kodu pocztowego jest wymagana."
    );
  }
}

record Miejscowosc(String wartosc) {
  public Miejscowosc {
    Objects.requireNonNull(
        wartosc, "Wartość dla miejscowości jest wymagana."
    );
  }
}