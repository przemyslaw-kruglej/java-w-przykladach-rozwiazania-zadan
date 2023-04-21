import java.util.Scanner;

public class LiczbaMinut {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę godzin: ");

    int liczbaGodzin = pobierzLiczbe();
    int liczbaMinut = liczbaGodzin * 60;

    System.out.printf(
        "Ta liczba godzin składa się z %d minut.",
        liczbaMinut
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
