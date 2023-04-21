package zadanie63;

import java.util.Arrays;

public class LiczenieSumyLiczb {
  public static int sumuj(int[] liczby) {
    return Arrays.stream(liczby).sum();
  }
}
