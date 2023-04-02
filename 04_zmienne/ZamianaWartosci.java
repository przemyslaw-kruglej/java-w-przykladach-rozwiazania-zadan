import java.util.Scanner;

public class ZamianaWartosci {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int pierwsza = pobierzLiczbe();

    System.out.print("Podaj drugą liczbę: ");
    int druga = pobierzLiczbe();

    int tmp = pierwsza;
    pierwsza = druga;
    druga = tmp;

    System.out.printf("Podałeś liczby %d oraz %d.", pierwsza, druga);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
