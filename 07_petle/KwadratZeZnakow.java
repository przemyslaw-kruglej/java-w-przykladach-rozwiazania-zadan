public class KwadratZeZnakow {
  public static void main(String[] args) {
    int dlugoscBoku = 8;
    char znak = 'x';

    for (int rzad = 1; rzad <= dlugoscBoku; rzad++) {
      for (int kolumna = 1; kolumna <= dlugoscBoku; kolumna++) {
        if (rzad == kolumna || // pierwsza przekątna
            rzad + kolumna == dlugoscBoku + 1 || // druga przekątna
            rzad == 1 || // górna krawędź
            kolumna == 1 || // lewa krawędź
            rzad == dlugoscBoku || // dolna krawędź
            kolumna == dlugoscBoku // prawa krawędź
        ) {
          System.out.print(znak);
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }
}
