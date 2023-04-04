public class OdwracanieKolejnosciElementowTablicy {
  public static void main(String[] args) {
    int[] liczby = { 25, -10, 99, 15, 7 };
    int zapamietanaLiczba;

    for (int i = 0, j = liczby.length - 1; i < j; i++, j--) {
      zapamietanaLiczba = liczby[i];
      liczby[i] = liczby[j];
      liczby[j] = zapamietanaLiczba;
    }

    for (int liczba : liczby) {
      System.out.print(liczba + " ");
    }
  }
}
