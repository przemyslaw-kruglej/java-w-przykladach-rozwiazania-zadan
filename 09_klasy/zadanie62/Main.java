package zadanie62;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    BazaProduktow baza = new BazaProduktow();
    baza.dodajProdukt(
        new Produkt("Puzzle z kotem", new BigDecimal("39.99")),
        5
    );
    baza.dodajProdukt(
        new Produkt("Puzzle z kotem", new BigDecimal("39.99")),
        2
    );
    baza.dodajProdukt(
        new Produkt("Bajki robotów", new BigDecimal("49.99")),
        1
    );
    baza.dodajProdukt(
        new Produkt("Nigdziebądź", new BigDecimal("34.99")),
        4
    );

    System.out.println(
        "Licza wszystkich produktów: " +
            baza.zliczWszystkieProdukty()
    );

    if (baza.czyProduktDostepny("Puzzle z kotem")) {
      System.out.println("Puzzle z kotem dostępne.");
    } else {
      System.out.println("Brak puzzli z kotem.");
    }
  }
}
