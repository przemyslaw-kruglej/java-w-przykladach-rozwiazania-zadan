public class LiczbyOdKonca {
  public static void main(String[] args) {
    for (int i = 10; i >= 1; i--) {
      if (i != 1) {
        System.out.print(i + ",");
      } else {
        System.out.print(i);
      }
    }
  }
}
