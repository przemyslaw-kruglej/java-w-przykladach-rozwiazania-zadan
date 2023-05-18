public class ObracanieDwuwymiarowejTablicy {
  public static void main(String[] args) {
    char[][] tablica = {
        { 'X', ' ' },
        { 'X', ' ' },
        { 'X', 'X' },
    };

    int liczbaRzedow = tablica.length;
    int liczbaKolumn = tablica[0].length;

    // wypisywanie tablicy dwuwymiarowej bez obrotu
    for (int rzad = 0; rzad < liczbaRzedow; rzad++) {
      for (int kolumna = 0; kolumna < liczbaKolumn; kolumna++) {
        System.out.print(tablica[rzad][kolumna]);
      }
      System.out.println();
    }

    System.out.println();

    // wypisywanie tablicy dwuwymiarowej obróconej w prawo o 90 stopni
    for (int kolumna = 0; kolumna < liczbaKolumn; kolumna++) {
      for (int rzad = liczbaRzedow - 1; rzad >= 0; rzad--) {
        System.out.print(tablica[rzad][kolumna]);
      }
      System.out.println();
    }

    System.out.println();

    // wypisywanie tablicy dwuwymiarowej obróconej o 180 stopni
    for (int rzad = liczbaRzedow - 1; rzad >= 0; rzad--) {
      for (int kolumna = liczbaKolumn - 1; kolumna >= 0; kolumna--) {
        System.out.print(tablica[rzad][kolumna]);
      }
      System.out.println();
    }

    System.out.println();

    // wypisywanie tablicy dwuwymiarowej obróconej o 90 stopni w lewo
    for (int kolumna = liczbaKolumn - 1; kolumna >= 0; kolumna--) {
      for (int rzad = 0; rzad < liczbaRzedow; rzad++) {
        System.out.print(tablica[rzad][kolumna]);
      }
      System.out.println();
    }
  }
}