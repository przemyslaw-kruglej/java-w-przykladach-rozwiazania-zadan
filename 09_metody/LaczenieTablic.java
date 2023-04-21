import java.util.Arrays;

public class LaczenieTablic {
  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(usunElement(new int[] { 1 }, 0))
    );
    System.out.println(
        Arrays.toString(usunElement(new int[] { 25, 100, -5 }, 1))
    );
    System.out.println(
        Arrays.toString(usunElement(new int[] { 25, 100, -5 }, 3))
    );
  }

  public static int[] usunElement(int[] liczby, int indeks) {
    if (indeks < 0 || indeks >= liczby.length) {
      return Arrays.copyOf(liczby, liczby.length);
    }

    int[] rezultat = new int[liczby.length - 1];

    for (int i = 0; i < rezultat.length; i++) {
      if (i < indeks) {
        rezultat[i] = liczby[i];
      } else {
        rezultat[i] = liczby[i + 1];
      }
    }
    return rezultat;
  }
}
