package zadanie64;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;
import java.io.IOException;
import java.nio.file.Paths;

public class WypiszDlugoscKazdegoSlowaTest
    extends ZadanieAlgorytmiczneTestBase {
  @Test
  public void kilkaZestawowZKrotkimiSlowami() {
    ustawDaneWejsciowe("""
        3
        kot pies wieloryb
        programowanie
        Ala ma kota
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        3 4 8
        13
        3 2 4
        """);
  }

  @Test
  public void zestawZDlugimSlowem() {
    ustawDaneWejsciowe(
        String.format("""
            1
            %s
            """,
            "a".repeat(1000)
        )
    );
    przetworzDaneWejsciowe();
    sprawdzWynik("1000");
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie64/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie64/zestaw_max_wyniki.txt")
    );
  }

  private void przetworzDaneWejsciowe() {
    try {
      WypiszDlugoscKazdegoSlowa.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
