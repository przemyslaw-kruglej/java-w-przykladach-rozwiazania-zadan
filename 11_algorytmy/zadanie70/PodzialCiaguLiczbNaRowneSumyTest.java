package zadanie70;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;

import java.io.IOException;
import java.nio.file.Paths;

public class PodzialCiaguLiczbNaRowneSumyTest
    extends ZadanieAlgorytmiczneTestBase {

  @Test
  public void kilkaZestawowZKrotkimiCiagamiLiczb() {
    ustawDaneWejsciowe("""
        4
        5 5 5 15
        1 2 3 4
        10 10 10 10
        100 10 10 10 10 10 10 10 10 10 10
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        3
        -1
        2
        1
        """);
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie70/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie70/zestaw_max_wyniki.txt")
    );
  }

  private void przetworzDaneWejsciowe() {
    try {
      PodzialCiaguLiczbNaRowneSumy.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
