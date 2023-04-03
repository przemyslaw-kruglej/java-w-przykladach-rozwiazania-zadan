import java.util.Scanner;

public class CzyPrzestepny {
  public static void main(String[] args) {
    int rok;
    String czyKolejnyRok;

    do {
      System.out.print("Podaj rok: ");
      rok = pobierzLiczbe();

      if (rok < 1) {
        System.out.println("Podano rok przed naszą erą.");
      } else if (
          (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)
      ) {
        System.out.println("Jest to rok przestępny.");
      } else {
        System.out.println("Nie jest to rok przestępny.");
      }

      System.out.print("Czy chcesz podać kolejny rok (tak/nie)? ");
      czyKolejnyRok = pobierzSlowo();
    } while ("tak".equals(czyKolejnyRok));
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
