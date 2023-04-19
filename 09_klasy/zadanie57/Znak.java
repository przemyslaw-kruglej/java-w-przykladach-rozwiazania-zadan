package zadanie57;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public enum Znak {
  PAPIER, KAMIEN, NOZYCE;

  private static final Random random = ThreadLocalRandom.current();

  public static Znak losowyZnak() {
    int indeksLosowegoZnaku = random.nextInt(values().length);
    return values()[indeksLosowegoZnaku];
  }
}
