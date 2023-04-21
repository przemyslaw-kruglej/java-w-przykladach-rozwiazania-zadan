import java.util.Scanner;

public class Temperatura {
  public static void main(String[] args) {
    System.out.print("Podaj temperaturę w skali Celsjusza: ");

    int temperatura = pobierzLiczbe();

    String pogoda = temperatura >= 20 ? "Ciepło!" : "Zimno!";

    System.out.println(pogoda);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
