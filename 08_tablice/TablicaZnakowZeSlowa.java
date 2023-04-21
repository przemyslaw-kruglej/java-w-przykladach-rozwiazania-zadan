import java.util.Scanner;

public class TablicaZnakowZeSlowa {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    char[] znaki = new char[slowo.length()];

    for (int i = 0; i < slowo.length(); i++) {
      znaki[i] = slowo.charAt(i);
    }

    for (char znak : znaki) {
      System.out.print(znak + " ");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
