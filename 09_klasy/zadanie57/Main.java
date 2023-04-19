package zadanie57;

import static zadanie57.WynikGry.*;
import static zadanie57.Znak.*;

public class Main {
  public static void main(String[] args) {
    symulujPapierKamienNozyce(
        new GraczZawszeZagrywajacyLosowyZnak(),
        new GraczZawszeZagrywajacyLosowyZnak(),
        5
    );
  }

  public static void symulujPapierKamienNozyce(
      GraczPapierKamienNozyce gracz1,
      GraczPapierKamienNozyce gracz2,
      int liczbaGier
  ) {
    for (int nrRundy = 1; nrRundy <= liczbaGier; nrRundy++) {
      Znak znak1 = gracz1.graj();
      Znak znak2 = gracz2.graj();

      System.out.printf(
          "Runda #%d: %s vs. %s%n", nrRundy, znak1, znak2
      );

      if (znak1 == znak2) {
        gracz1.rezultatGry(REMIS, znak2);
        gracz2.rezultatGry(REMIS, znak1);
        System.out.println("Remis.");
      } else if (
          (znak1 == KAMIEN && znak2 == NOZYCE) ||
          (znak1 == NOZYCE && znak2 == PAPIER) ||
          (znak1 == PAPIER && znak2 == KAMIEN)
      ) {
        gracz1.rezultatGry(WYGRANA, znak2);
        gracz2.rezultatGry(PRZEGRANA, znak1);
        System.out.println("Wygrał pierwszy gracz.");
      } else {
        gracz1.rezultatGry(PRZEGRANA, znak2);
        gracz2.rezultatGry(WYGRANA, znak1);
        System.out.println("Wygrał drugi gracz.");
      }
    }
  }
}
