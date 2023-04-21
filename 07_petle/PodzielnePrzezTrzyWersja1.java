import java.util.Scanner;

public class PodzielnePrzezTrzyWersja1 {
  public static void main(String[] args) {
    System.out.print("Podaj dolny zakres: ");
    int start = pobierzLiczbe();

    System.out.print("Podaj górny zakres: ");
    int koniec = pobierzLiczbe();

    System.out.println(
        "Liczby podzielne przez trzy z tego zakresu to:"
    );

    for (int i = start; i <= koniec; i++) {
      if (i % 3 == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
