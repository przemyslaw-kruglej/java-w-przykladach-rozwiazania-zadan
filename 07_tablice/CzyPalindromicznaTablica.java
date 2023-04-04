public class CzyPalindromicznaTablica {
  public static void main(String[] args) {
    int[] liczby = new int[] { 5, 2, 1, 2, 5 };

    boolean roznicaZnaleziona = false;

    for (int i = 0; i < liczby.length / 2; i++) {
      if (liczby[i] != liczby[liczby.length - 1 - i]) {
        roznicaZnaleziona = true;
        break;
      }
    }

    if (roznicaZnaleziona) {
      System.out.println("Elementy tablicy nie tworzą palindromu.");
    } else {
      System.out.println("Elementy tablicy tworzą palindrom.");
    }
  }
}
