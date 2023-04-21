import java.util.Arrays;

public class WstawianieTablicyDoTablicy {
  public static void main(String[] args) {
    int[] tab1 = {0, 1, 2, 3, 4};
    int[] tab2 = {5, 6};

    System.out.println(
        Arrays.toString(wstawTabliceDoTablicy(tab1, tab2, 0))
    );
    System.out.println(
        Arrays.toString(wstawTabliceDoTablicy(tab1, tab2, 2))
    );
    System.out.println(
        Arrays.toString(wstawTabliceDoTablicy(tab1, tab2, 5))
    );
  }

  public static int[] wstawTabliceDoTablicy(
      int[] tab1, int[] tab2, int indeks
  ) {
    if (indeks < 0 || indeks > tab1.length) {
      throw new IllegalArgumentException(
          "Indeks musi być z zakresu <0, tab1.length>"
      );
    }

    int[] rezultat = new int[tab1.length + tab2.length];

    for (int i = 0; i < rezultat.length; i++) {
      if (i < indeks) {
        rezultat[i] = tab1[i];
      } else if (i < indeks + tab2.length) {
        rezultat[i] = tab2[i - indeks];
      } else {
        rezultat[i] = tab1[i - tab2.length];
      }
    }

    return rezultat;
  }
}
