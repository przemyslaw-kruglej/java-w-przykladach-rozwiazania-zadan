import java.util.Scanner;

public class CzyLiczbaParzysta {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");

    int liczba = pobierzLiczbe();

    boolean czyParzysta = liczba % 2 == 0;

    if (czyParzysta) {
      System.out.println("Ta liczba jest parzysta.");
    } else {
      System.out.println("Ta liczba jest nieparzysta.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
