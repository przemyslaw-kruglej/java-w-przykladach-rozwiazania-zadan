import java.util.Scanner;

public class NazwaMiesiacaWyrazenieSwitch {
  public static void main(String[] args) {
    System.out.print("Podaj numer miesiąca (od 1 do 12): ");

    int numerMiesiaca = pobierzLiczbe();

    String nazwaMiesiaca = switch (numerMiesiaca) {
      case 1 -> "styczeń";
      case 2 -> "luty";
      case 3 -> "marzec";
      case 4 -> "kwiecień";
      case 5 -> "maj";
      case 6 -> "czerwiec";
      case 7 -> "lipiec";
      case 8 -> "sierpień";
      case 9 -> "wrzesień";
      case 10 -> "październik";
      case 11 -> "listopad";
      case 12 -> "grudzień";
      default -> "nieprawidłowy miesiąc";
    };

    System.out.println(
        String.format(
            "Miesiąc o numerze %d to %s.",
            numerMiesiaca,
            nazwaMiesiaca
        )
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
