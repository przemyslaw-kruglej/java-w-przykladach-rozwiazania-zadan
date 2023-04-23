package util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class ZadanieAlgorytmiczneTestBase {
  private final PrintStream originalOut = System.out;
  private final InputStream originalIn = System.in;
  private final ByteArrayOutputStream testOut =
      new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(testOut));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(originalOut);
    System.setIn(originalIn);
  }

  protected void ustawDaneWejsciowe(String dane) {
    System.setIn(new ByteArrayInputStream(dane.getBytes()));
  }

  protected void ustawDaneWejsciowe(Path sciezkaDoPliku) {
    try {
      ustawDaneWejsciowe(Files.readString(sciezkaDoPliku));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  protected void sprawdzWynik(String expected) {
    assertEquals(
        // trim jest użyty na obu wartościach dla szczególnego
        // przypadku, gdy wynik znajduje się w pojedynczej linii.
        // Jeżeli trim by zabrakło, przekazanie expected
        // jako, dla przykładu, "13", skutkowałoby
        // błędem asercji, bo w wartości pobranej z testOut
        // zawsze występuje znak nowej linii na końcu.
        // replaceAll ma na celu zamianę domyślnego,
        // systemowego separatora linii na \n
        // Dzięki temu, oczekiwany wynik można zapisać
        // za pomocą wielolinijkowego łańcucha znaków w """ """
        expected.replaceAll(System.lineSeparator(), "\n").trim(),
        testOut.toString()
            .replaceAll(System.lineSeparator(), "\n").trim()
    );
  }

  protected void sprawdzWynik(Path sciezkaDoPliku) {
    try {
      sprawdzWynik(Files.readString(sciezkaDoPliku));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
