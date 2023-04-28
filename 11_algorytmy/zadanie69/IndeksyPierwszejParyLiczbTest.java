package zadanie69;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;

import java.io.IOException;
import java.nio.file.Paths;

public class IndeksyPierwszejParyLiczbTest
    extends ZadanieAlgorytmiczneTestBase {

  @Test
  public void kilkaZestawowZKrotkimiCiagamiLiczb() {
    ustawDaneWejsciowe("""
        4
        1 1 1
        1 2 3 4 5 2
        1 2 3
        1 2 3 1 2 3
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        0 1
        1 5
        -1
        0 3
        """);
  }

  @Test
  public void zestawyZOpisuZadania() {
    ustawDaneWejsciowe("""
        5
        10 20 30 10
        4 5 5 4
        1 2 3
        1
        50 60 70 80 90 100 100
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        0 3
        1 2
        -1
        -1
        5 6
        """);
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie69/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie69/zestaw_max_wyniki.txt")
    );
  }

  private void przetworzDaneWejsciowe() {
    try {
      IndeksyPierwszejParyLiczb.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
