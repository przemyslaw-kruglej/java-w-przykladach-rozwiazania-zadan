import java.util.Arrays;

public class ArgumentyBezDuplikatow {
  public static void main(String[] args) {
    Arrays.sort(args);
    String[] argumentyBezDuplikatow = usunDuplikaty(args);
    System.out.println(Arrays.toString(argumentyBezDuplikatow));
  }

  /**
   * Zwraca nową, posortowaną tablicę, która jest kopią
   * argumentu z pominięciem zduplikowanych elementów.
   * @param tab Źródłowa tablica, która może zawierać duplikaty.
   *            Musi być posortowana niemalejąco.
   *            Dodatkowe założenie: tablica nie zawiera wartości null.
   * @return Kopia źródłowej tablicy bez duplikatów.
   */
  public static String[] usunDuplikaty(String[] tab) {
    String[] tabBezDuplikatow = new String[tab.length];
    int liczbaUnikalnychElementow = 0;

    for (int i = 0; i < tab.length; i++) {
      if (i == 0 || !tab[i].equals(tab[i - 1])) {
        tabBezDuplikatow[liczbaUnikalnychElementow] = tab[i];
        liczbaUnikalnychElementow++;
      }
    }

    return Arrays.copyOf(tabBezDuplikatow, liczbaUnikalnychElementow);
  }
}
