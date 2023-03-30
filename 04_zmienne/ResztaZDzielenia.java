import java.util.Scanner;

public class ResztaZDzielenia {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");

    int liczba = pobierzLiczbe();

    int wynik = liczba % 7;

    System.out.printf(
        "Reszta z dzielenia tej liczby przez 7 to %d.%n", wynik
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
