import java.util.Scanner;

public class CzyLiczbaPierwsza {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    if (liczba <= 1) {
      System.out.println("Nie jest to liczba pierwsza");
    } else {
      boolean dzielnikZnaleziony = false;

      for (int i = 2; i < liczba; i++) {
        if (liczba % i == 0) {
          dzielnikZnaleziony = true;
          break;
        }
      }

      if (dzielnikZnaleziony) {
        System.out.println("Nie jest to liczba pierwsza");
      } else {
        System.out.println("Jest to liczba pierwsza.");

      }
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
