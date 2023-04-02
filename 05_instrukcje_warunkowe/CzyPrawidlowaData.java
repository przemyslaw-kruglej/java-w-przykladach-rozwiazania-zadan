import java.util.Scanner;

public class CzyPrawidlowaData {
  public static void main(String[] args) {
    System.out.print("Podaj rok naszej ery: ");
    int rok = pobierzLiczbe();

    System.out.print("Podaj miesiąc: ");
    int miesiac = pobierzLiczbe();

    System.out.print("Podaj dzień: ");
    int dzien = pobierzLiczbe();

    String blad = "";

    if (rok < 1) {
      blad = "Podano rok przed naszą erą.";
    } else if (miesiac < 1 || miesiac > 12) {
      blad = "Podano nieprawidłowy miesiąc.";
    } else {
      if (dzien < 1) {
        blad = "Podano nieprawidłowy dzień.";
      } else {
        if (miesiac == 2) {
          boolean czyPrzestepny =
              (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);

          if (czyPrzestepny && dzien > 29) {
            blad = "Niepoprawny dzień: w podanym roku luty ma 29 dni.";
          } else if (!czyPrzestepny && dzien > 28) {
            blad = "Podany rok nie jest przestępny: luty ma 28 dni.";
          }
        } else if (dzien > 30 &&
            (miesiac == 4 || miesiac == 6 ||
             miesiac == 9 || miesiac == 11)
        ) {
          blad = "Nieprawidłowy dzień: podany miesiąc ma 30 dni.";
        } else if (dzien > 31) {
          blad = "Nieprawidłowy dzień: podany miesiąc ma 31 dni.";
        }
      }
    }

    if (!blad.isEmpty()) {
      System.out.println(blad);
      System.out.println("Nie jest to poprawna data.");
    } else {
      System.out.println("Jest to poprawna data.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
