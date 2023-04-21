package zadanie63;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiczenieSumyLiczbTest {

  @Test
  public void nullTablicaSpowodujeWyjatek() {
    assertThrows(
        NullPointerException.class,
        () -> LiczenieSumyLiczb.sumuj(null)
    );
  }

  @Test
  public void pustaTablicaPowinnaMiecSumeZero() {
    assertEquals(0, LiczenieSumyLiczb.sumuj(new int[] {}));
  }

  @Test
  public void sumaKilkuElementowJestPoprawna() {
    assertEquals(
        12,
        LiczenieSumyLiczb.sumuj(new int[] { 1, 5, 10, -4 })
    );
  }

  @Test
  public void zbytDuzaSumaSpowodujePrzekrecenieLicznika() {
    assertEquals(
        Integer.MIN_VALUE,
        LiczenieSumyLiczb.sumuj(new int[] { Integer.MAX_VALUE, 1 })
    );
  }
}