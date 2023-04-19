package zadanie59;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LiczenieZnakowWPliku {
  public static int policzZnaki(String sciezkaDoPliku) {
    if (!sciezkaDoPliku.toLowerCase().endsWith(".txt")) {
      throw new IllegalArgumentException(
          "Spodziewano się pliku o rozszerzeniu txt"
      );
    }

    try (FileReader fileReader = new FileReader(sciezkaDoPliku)) {
      int liczbaZnakow = 0;

      while (fileReader.read() != -1) {
        liczbaZnakow++;
      }

      return liczbaZnakow;
    } catch(FileNotFoundException e) {
      throw new IllegalArgumentException("Podany plik nie istnieje.");
    } catch (IOException e) {
      throw new RuntimeException(
          "Wystąpił błąd podczas odczytywania pliku.", e
      );
    }
  }
}
