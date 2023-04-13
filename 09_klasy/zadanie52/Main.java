package zadanie52;

public class Main {
  public static void main(String[] args) {
    Adres adres = new Adres(
        new Ulica("Jasna"),
        new NumerDomu("42b"),
        new NumerMieszkania(341),
        new KodPocztowy("99-999"),
        new Miejscowosc("Warszawa")
    );
    System.out.println(adres);
  }
}
