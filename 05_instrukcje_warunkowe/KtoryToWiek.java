import java.util.Scanner;

public class KtoryToWiek {
  public static void main(String[] args) {
    System.out.print("Podaj rok naszej ery: ");

    int rok = pobierzLiczbe();

    if (rok < 1) {
      System.out.println("Podano rok przed naszą erą.");
    } else {
      int wiek = rok / 100;

      if (rok % 100 > 0) {
        wiek++;
      }

      System.out.printf("Ten rok należy do %d wieku.%n", wiek);
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
