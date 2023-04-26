package zadanie66;

import org.junit.jupiter.api.Test;
import util.ZadanieAlgorytmiczneTestBase;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;
import static zadanie66.BokiTrojkata.czyBokiTrojkata;

public class BokiTrojkataTest
    extends ZadanieAlgorytmiczneTestBase {

  @Test
  public void kilkaZestawowZKrotkimiCiagamiLiczb() {
    ustawDaneWejsciowe("""
        4
        10 15 20
        1 2 3 4 5
        1 2 3
        1 10 15 2 20
        """);
    przetworzDaneWejsciowe();
    sprawdzWynik("""
        10 15 20
        2 3 4
        -1
        -1
        """);
  }

  @Test
  public void maksymalnyZestaw() {
    ustawDaneWejsciowe(
        Paths.get("11_algorytmy/zadanie66/zestaw_max_dane.txt")
    );
    przetworzDaneWejsciowe();
    sprawdzWynik(
        Paths.get("11_algorytmy/zadanie66/zestaw_max_wyniki.txt")
    );
  }

  @Test
  public void czyBokiTrojkata_niepoprawneBoki_zwrociFalse() {
    assertFalse(czyBokiTrojkata(1, 2, 3));
    assertFalse(czyBokiTrojkata(1, 3, 2));
    assertFalse(czyBokiTrojkata(2, 1, 3));
    assertFalse(czyBokiTrojkata(2, 3, 1));
    assertFalse(czyBokiTrojkata(3, 1, 2));
    assertFalse(czyBokiTrojkata(3, 2, 1));
  }

  @Test
  public void czyBokiTrojkata_poprawneBoki_zwrociTrue() {
    assertTrue(czyBokiTrojkata(10, 12, 13));
    assertTrue(czyBokiTrojkata(10, 13, 12));
    assertTrue(czyBokiTrojkata(12, 10, 13));
    assertTrue(czyBokiTrojkata(12, 13, 10));
    assertTrue(czyBokiTrojkata(13, 10, 12));
    assertTrue(czyBokiTrojkata(13, 12, 10));
  }

  private void przetworzDaneWejsciowe() {
    try {
      BokiTrojkata.main(new String[]{});
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
