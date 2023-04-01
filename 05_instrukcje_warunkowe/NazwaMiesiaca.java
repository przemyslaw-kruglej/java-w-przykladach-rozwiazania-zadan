import java.util.Scanner;

public class NazwaMiesiaca {
  public static void main(String[] args) {
    System.out.print("Podaj numer miesiąca (od 1 do 12): ");

    int numerMiesiaca = pobierzLiczbe();

    String nazwaMiesiaca;

    switch (numerMiesiaca) {
      case 1:
        nazwaMiesiaca = "styczeń";
        break;
      case 2:
        nazwaMiesiaca = "luty";
        break;
      case 3:
        nazwaMiesiaca = "marzec";
        break;
      case 4:
        nazwaMiesiaca = "kwiecień";
        break;
      case 5:
        nazwaMiesiaca = "maj";
        break;
      case 6:
        nazwaMiesiaca = "czerwiec";
        break;
      case 7:
        nazwaMiesiaca = "lipiec";
        break;
      case 8:
        nazwaMiesiaca = "sierpień";
        break;
      case 9:
        nazwaMiesiaca = "wrzesień";
        break;
      case 10:
        nazwaMiesiaca = "październik";
        break;
      case 11:
        nazwaMiesiaca = "listopad";
        break;
      case 12:
        nazwaMiesiaca = "grudzień";
        break;
      default:
        nazwaMiesiaca = "nieprawidłowy miesiąc";
    }

    System.out.printf(
        "Miesiąc o numerze %d to %s.%n",
        numerMiesiaca,
        nazwaMiesiaca
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
