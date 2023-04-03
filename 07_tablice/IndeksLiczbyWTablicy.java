public class IndeksLiczbyWTablicy {
  public static void main(String[] args) {
    int[] tablica = { 5, 14, 100, 18, -20, 27 };
    int szukanaLiczba = 27;
    int indeksSzukanejLiczby = -1;

    for (int i = 0; i < tablica.length; i++) {
      if (tablica[i] == szukanaLiczba) {
        indeksSzukanejLiczby = i;
        break;
      }
    }

    System.out.println(
        "Indeks szukanej liczby: " + indeksSzukanejLiczby
    );
  }
}
