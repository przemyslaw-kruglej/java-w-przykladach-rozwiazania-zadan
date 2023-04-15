package zadanie54;

import static zadanie54.LiczeniePolFigur.policzPoleKola;
import static zadanie54.LiczeniePolFigur.policzPoleKwadratu;
import static zadanie54.LiczeniePolFigur.policzPoleProstokata;

public class Main {
  public static void main(String[] args) {
    double promienKola = 5.8;
    System.out.printf(
        "Pole koła o promieniu %f wynosi %f%n",
        promienKola,
        policzPoleKola(promienKola)
    );

    double bokKwadratu = 7.7;
    System.out.printf(
        "Pole kwadratu o boku %f wynosi %f%n",
        bokKwadratu,
        policzPoleKwadratu(bokKwadratu)
    );

    double bokAProstokata = 8, bokBProstokata = 5;
    System.out.printf(
        "Pole prostokąta o bokach %f i %f wynosi %f%n",
        bokAProstokata,
        bokBProstokata,
        policzPoleProstokata(bokAProstokata, bokBProstokata)
    );
  }
}
