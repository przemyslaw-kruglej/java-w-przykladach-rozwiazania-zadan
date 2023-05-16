import java.util.Scanner;

public class PrzeliczanieTemperatury {
  public static void main(String[] args) {
    System.out.print(
        "Podaj temperaturę w stopniach Celsjusza: "
    );
    int temperaturaCelsjusz = pobierzLiczbe();

    double temperaturaKelvin = temperaturaCelsjusz + 273.15;
    double temperaturaFahrenheit =
        2 * temperaturaCelsjusz + 32;

    System.out.printf("""
            Ta temperatura w skali Kelvina to %.2f.
            Ta temperatura w skali Fahrenheita to %.2f.
            """,
        temperaturaKelvin, temperaturaFahrenheit
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
