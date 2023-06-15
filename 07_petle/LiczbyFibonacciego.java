public class LiczbyFibonacciego {
  public static void main(String[] args) {
    // zmienne pomocnicze przechowujące wartości dwóch
    // poprzednich liczb Fibonacciego inicjalizujemy je
    // wartościami pierwszej i drugiej liczby Fibonacciego
    int fibDlaNMinus2 = 0;
    int fibDlaNMinus1 = 1;
    int maksymalneN = 20;

    for (int n = 0; n <= maksymalneN; n++) {
      int aktualnaLiczbaFibonacciego;

      if (n == 0) {
        aktualnaLiczbaFibonacciego = 0;
      } else if (n == 1) {
        aktualnaLiczbaFibonacciego = 1;
      } else {
        aktualnaLiczbaFibonacciego = fibDlaNMinus1 + fibDlaNMinus2;
        fibDlaNMinus2 = fibDlaNMinus1;
        fibDlaNMinus1 = aktualnaLiczbaFibonacciego;
      }

      if (n < maksymalneN) {
        System.out.print(aktualnaLiczbaFibonacciego + ",");
      } else {
        System.out.print(aktualnaLiczbaFibonacciego);
      }
    }
  }
}
