import java.util.Scanner;

public class SortowanieWczytywanychLiczb {
  public static void main(String[] args) {
    System.out.print("Podaj, ile liczb chcesz posortować: ");
    int ileLiczb = pobierzLiczbe();

    int[] liczby = new int[ileLiczb];

    for (int i = 0; i < ileLiczb; i++) {
      System.out.print("Podaj liczbę #" + (i + 1) + ": ");
      liczby[i] = pobierzLiczbe();

      for (int j = i; j > 0 && liczby[j] < liczby[j - 1]; j--) {
        int zamienianaLiczba = liczby[j];
        liczby[j] = liczby[j - 1];
        liczby[j - 1] = zamienianaLiczba;
      }
    }

    System.out.print("Liczby posortowane niemalejąco: ");

    for (int liczba : liczby) {
      System.out.print(liczba + " ");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
