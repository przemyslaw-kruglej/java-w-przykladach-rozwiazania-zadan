package zadanie65;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;

import java.io.IOException;
import java.nio.file.Paths;

public class NajwiekszaLiczbaTest
    extends ZadanieAlgorytmiczneTestBase {

  @Test
  public void kilkaZestawowZKrotkimiCiagamiLiczb() {
    ustawDaneWejsciowe("""
        3
        1 0 1 0 1 0 1 0
        0 -5 -4 -3 -2 -1 0
        9223372036854775807
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        1 4
        0 2
        9223372036854775807 1
        """);
  }

  @Test
  public void zestawyZMinMaxWartosciami() {
    ustawDaneWejsciowe("""
        3
        9223372036854775807 9223372036854775807
        -9223372036854775808
        -9223372036854775808 0 9223372036854775807
        """
    );

    przetworzDaneWejsciowe();

    sprawdzWynik("""
        9223372036854775807 2
        -9223372036854775808 1
        9223372036854775807 1
        """);
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie65/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie65/zestaw_max_wyniki.txt")
    );
  }

  private void przetworzDaneWejsciowe() {
    try {
      NajwiekszaLiczba.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
