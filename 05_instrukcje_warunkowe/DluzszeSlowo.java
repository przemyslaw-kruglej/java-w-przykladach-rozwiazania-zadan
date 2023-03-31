import java.util.Scanner;

public class DluzszeSlowo {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String pierwszeSlowo = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String drugieSlowo = pobierzSlowo();

    if (pierwszeSlowo.length() > drugieSlowo.length()) {
      System.out.println("Pierwsze słowo zawiera więcej znaków.");
    } else if (pierwszeSlowo.length() < drugieSlowo.length()) {
      System.out.println("Drugie słowo zawiera więcej znaków.");
    } else {
      System.out.println("Oba słowa zawierają tyle samo znaków.");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
