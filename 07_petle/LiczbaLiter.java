import java.util.Scanner;

public class LiczbaLiter {
  public static void main(String[] args) {
    String slowo, czyKolejneSlowo;

    do {
      System.out.print("Podaj słowo: ");
      slowo = pobierzSlowo();

      System.out.println(
          "Liczba znaków w tym słowie to " + slowo.length()
      );

      System.out.print("Czy chcesz podać kolejne słowo (tak/nie)? ");
      czyKolejneSlowo = pobierzSlowo();
    } while ("tak".equals(czyKolejneSlowo));
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
