package zadanie56;

import java.util.Scanner;

public class PowitanieUzytkownika {
  public static void main(String[] args) {
    System.out.print("Podaj imię: ");

    String imie = pobierzSlowo();

    System.out.printf("Witaj %s", imie);
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
