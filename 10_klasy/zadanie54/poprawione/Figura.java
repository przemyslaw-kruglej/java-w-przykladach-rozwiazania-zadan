package zadanie54.poprawione;

import java.util.Arrays;

class Figura {
  private final String nazwa;
  private final Punkt[] wierzcholki;

  public Figura(String nazwa, Punkt[] wierzcholki) {
    this.nazwa = nazwa;
    this.wierzcholki = Arrays.copyOf(
        wierzcholki, wierzcholki.length
    );
  }

  public String getNazwa() {
    return nazwa;
  }

  public Punkt[] getWierzcholki() {
    return Arrays.copyOf(wierzcholki, wierzcholki.length);
  }

  @Override
  public String toString() {
    return String.format(
        "Figura[nazwa=%s, wierzcholki=%s]",
        nazwa,
        Arrays.toString(wierzcholki)
    );
  }
}
