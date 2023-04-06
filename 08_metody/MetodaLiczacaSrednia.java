import java.util.Scanner;

public class MetodaLiczacaSrednia {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int a = pobierzLiczbe();
    System.out.print("Podaj drugą liczbę: ");
    int b = pobierzLiczbe();

    System.out.printf(
        "Zaokrąglona średnia liczb %d i %d wynosi %d",
        a, b, policzSrednia(a, b)
    );
  }

  public static int policzSrednia(int x, int y) {
    return (x + y) / 2;
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
