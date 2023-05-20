package zadanie60;

public class Main {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Brak argumentu - ścieżki do pliku.");
    } else {
      System.out.println(
          LiczenieZnakowWPliku.policzZnaki(args[0])
      );
    }
  }
}
