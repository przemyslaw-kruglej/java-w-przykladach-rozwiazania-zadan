import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GraZgadywanieLiczby {
  public static void main(String[] args) {
    String czyGracDalej;

    do {
      zgadujLiczbe();
      System.out.print("Jeżeli chcesz grać dalej, napisz 'tak': ");
      czyGracDalej = pobierzSlowo();
    } while ("tak".equalsIgnoreCase(czyGracDalej));
  }

  public static void zgadujLiczbe() {
    Random random = ThreadLocalRandom.current();
    int liczbaDoZgadniecia = random.nextInt(100) + 1;
    int podanaLiczba;
    int liczbaProb = 0;

    System.out.println("\nZgadnij liczbę od 1 do 100!");

    do {
      System.out.print("Jaką liczbę wylosowałem? ");
      podanaLiczba = pobierzLiczbe();

      if (podanaLiczba < liczbaDoZgadniecia) {
        System.out.println("Za mała liczba!");
      } else if (podanaLiczba > liczbaDoZgadniecia) {
        System.out.println("Za duża liczba!");
      }
      liczbaProb++;
    } while (podanaLiczba != liczbaDoZgadniecia);

    System.out.printf(
        "Brawo! Zgadywałeś %d raz(y).%n", liczbaProb
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
