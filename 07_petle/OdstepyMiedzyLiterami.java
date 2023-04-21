import java.util.Scanner;

public class OdstepyMiedzyLiterami {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");

    String slowo = pobierzSlowo();

    for (int i = 0; i < slowo.length(); i++) {
      System.out.print(slowo.charAt(i) + " ");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
