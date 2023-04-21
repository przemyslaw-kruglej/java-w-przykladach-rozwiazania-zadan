import java.util.Scanner;

public class PodzielnePrzezTrzyWersja2 {
  public static void main(String[] args) {
    System.out.print("Podaj dolny zakres: ");
    int start = pobierzLiczbe();

    System.out.print("Podaj górny zakres: ");
    int koniec = pobierzLiczbe();

    System.out.println(
        "Liczby podzielne przez trzy z tego zakresu to:"
    );

    if (start % 3 != 0) {
      start += 3 - start % 3;
    }

    for (int i = start; i <= koniec; i += 3) {
      System.out.print(i + " ");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
