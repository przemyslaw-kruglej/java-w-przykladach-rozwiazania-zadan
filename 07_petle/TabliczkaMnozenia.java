public class TabliczkaMnozenia {
  public static void main(String[] args) {
    int max = 10;

    for (int i = 0; i <= max; i++) {
      System.out.printf("%-3s", i == 0 ? "x" : i);
    }

    System.out.println();

    for (int j = 1; j <= max; j++) {
      System.out.printf("%-3d", j);

      for (int k = 1; k <= max; k++) {
        System.out.printf("%-3d", j * k);
      }

      System.out.println();
    }
  }
}
