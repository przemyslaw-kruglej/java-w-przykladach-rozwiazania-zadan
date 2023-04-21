public class SumowanieElementowTablicyDwuwymiarowej {
  public static void main(String[] args) {
    int[][] liczby = {
        { 20, 30, 40, 10 },
        { -1, 0, 1, 0 },
        { 1, 2, 3, 4 }
    };
    int[] sumaLiczb = new int[liczby.length];

    for (int rzad = 0; rzad < liczby.length; rzad++) {
      for (int kolumna = 0; kolumna < liczby[rzad].length; kolumna++) {
        sumaLiczb[rzad] += liczby[rzad][kolumna];
      }
    }

    for (int i = 0; i < sumaLiczb.length; i++) {
      System.out.printf(
          "Suma liczb rzędu %d wynosi: %d%n", i + 1, sumaLiczb[i]
      );
    }
  }
}
