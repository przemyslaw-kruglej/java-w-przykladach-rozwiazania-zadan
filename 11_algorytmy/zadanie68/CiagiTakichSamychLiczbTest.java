package zadanie68;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;

import java.io.IOException;
import java.nio.file.Paths;

public class CiagiTakichSamychLiczbTest
    extends ZadanieAlgorytmiczneTestBase {

  @Test
  public void kilkaZestawowZKrotkimiCiagamiLiczb() {
    ustawDaneWejsciowe("""
        4
        1 1 1 1 1
        1
        1 2 3
        1
        1
        2
        1 2 3 4 5
        5 4 3 2 1
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        1
        0
        0
        1
        """);
  }

  @Test
  public void daneZOpisuZadania() {
    ustawDaneWejsciowe("""
        3
        10
        10 10 10
        1 2 3 4 5
        1 2 3 4
        10 15 20 25
        25 20 20 20 15 10
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        1
        0
        1
        """);
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie68/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie68/zestaw_max_wyniki.txt")
    );
  }

  private void przetworzDaneWejsciowe() {
    try {
      CiagiTakichSamychLiczb.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
