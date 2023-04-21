public class SumaDowolnejLiczbyArgumentow {
  public static void main(String[] args) {
    System.out.printf(
        "Suma liczb 10, 20, 30, 40, 50 wynosi %d%n",
        sumujLiczby(10, 20, 30, 40, 50)
    );

    System.out.printf(
        "Suma liczb -5, 0, 5 wynosi %d",
        sumujLiczby(-5, 0, 5)
    );
  }

  public static int sumujLiczby(int ...liczby) {
    int suma = 0;

    for (int liczba : liczby) {
      suma += liczba;
    }

    return suma;
  }
}
