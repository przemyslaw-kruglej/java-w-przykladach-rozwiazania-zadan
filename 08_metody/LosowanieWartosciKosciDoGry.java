import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LosowanieWartosciKosciDoGry {
  public static void main(String[] args) {
    if (args.length == 0) {
      losujWartoscKosci(1);
    } else {
      losujWartoscKosci(Integer.parseInt(args[0]));
    }
  }

  public static void losujWartoscKosci(int ileRazy) {
    Random random = ThreadLocalRandom.current();

    for (int i = 1; i <= ileRazy; i++) {
      int wylosowanaWartoscKostki = random.nextInt(6) + 1;
      System.out.printf(
          "Rzut kostką #%d: %d%n",
          i,
          wylosowanaWartoscKostki
      );
    }
  }
}
