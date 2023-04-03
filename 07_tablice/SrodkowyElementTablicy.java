public class SrodkowyElementTablicy {
  public static void main(String[] args) {
    int[] tab = { 11, 50, 24, 8, 16 };

    double srodkowyElement;
    int polowaDlugosci = tab.length / 2;

    if (tab.length % 2 == 0) {
      srodkowyElement =
          (tab[polowaDlugosci - 1] + tab[polowaDlugosci]) / 2.0;
    } else {
      srodkowyElement = tab[polowaDlugosci];
    }

    System.out.println("Środkowy element: " + srodkowyElement);
  }
}
