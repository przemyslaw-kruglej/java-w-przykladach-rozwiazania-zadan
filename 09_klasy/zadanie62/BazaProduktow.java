package zadanie62;

import java.util.HashMap;
import java.util.Map;

public class BazaProduktow {
  private final Map<Produkt, Integer> produkty
      = new HashMap<>();

  public void dodajProdukt(Produkt produkt, int liczbaSztuk) {
    produkty.merge(produkt, liczbaSztuk, Integer::sum);
  }

  public int zliczWszystkieProdukty() {
    return produkty
        .values()
        .stream()
        .reduce(0, Integer::sum);
  }

  public boolean czyProduktDostepny(String nazwa) {
    return produkty
        .entrySet()
        .stream()
        .anyMatch(
            e -> e.getKey().nazwa().equalsIgnoreCase(nazwa) &&
                e.getValue() > 0
        );
  }
}
