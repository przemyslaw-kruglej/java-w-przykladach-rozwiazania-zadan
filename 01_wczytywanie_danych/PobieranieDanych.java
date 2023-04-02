import java.util.Scanner;

public class PobieranieDanych {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    System.out.printf("Podałeś liczbę %d oraz słowo %s", liczba, slowo);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
