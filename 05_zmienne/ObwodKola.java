public class ObwodKola {
  public static void main(String[] args) {
    final double PI = 3.14;
    double r = 4.6;

    double obwod = 2 * PI * r;

    System.out.printf(
        "Obwód koła o promieniu %.2f wynosi %.2f.",
        r,
        obwod
    );
  }
}
