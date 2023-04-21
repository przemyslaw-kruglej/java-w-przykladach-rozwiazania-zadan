public class PrzesuwanieElementowWPrawoOJeden {
  public static void main(String[] args) {
    int[] liczby = { 100, 5, 0, -20, 15 };

    int ostatniElement = liczby[liczby.length - 1];

    for (int i = liczby.length - 1; i > 0 ; i--) {
      liczby[i] = liczby[i - 1];
    }

    liczby[0] = ostatniElement;

    for (int liczba : liczby) {
      System.out.print(liczba + " ");
    }
  }
}
