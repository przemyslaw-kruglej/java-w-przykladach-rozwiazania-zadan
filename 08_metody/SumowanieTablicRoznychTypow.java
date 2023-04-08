public class SumowanieTablicRoznychTypow {
  public static void main(String[] args) {
    int[] calkowite = { 10, 0, -5, 23 };
    float[] rzeczywiste = { 1, -20, 5.5f, 40.2f, 7 };

    System.out.println(
        "Suma liczb całkowitych: " + sumuj(calkowite)
    );
    System.out.println(
        "Suma liczb rzeczywistych: " + sumuj(rzeczywiste)
    );
  }

  public static float sumuj(float[] liczby) {
    float suma = 0;
    for (float liczba : liczby) {
      suma += liczba;
    }
    return suma;
  }

  public static int sumuj(int[] liczby) {
    int suma = 0;
    for (int liczba : liczby) {
      suma += liczba;
    }
    return suma;
  }
}
