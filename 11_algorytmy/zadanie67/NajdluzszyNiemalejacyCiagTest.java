package zadanie67;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;

import java.io.IOException;
import java.nio.file.Paths;

public class NajdluzszyNiemalejacyCiagTest
    extends ZadanieAlgorytmiczneTestBase {

  @Test
  public void kilkaZestawowZKrotkimiCiagamiLiczb() {
    ustawDaneWejsciowe("""
        5
        1 2 3 4 5 6 7 8 9 10
        5 4 3 2 1
        10 10 30 10 10 20
        1 2 1 2 3 4 1 2 3
        100
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        10
        1
        3
        4
        1
        """);
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie67/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie67/zestaw_max_wyniki.txt")
    );
  }

  private void przetworzDaneWejsciowe() {
    try {
      NajdluzszyNiemalejacyCiag.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
