package zadanie53.doPoprawy;

import java.util.Arrays;

public class Figura {
  private String nazwa;
  private Punkt[] wierzcholki;

  public Figura(String nazwa, Punkt[] wierzcholki) {
    this.nazwa = nazwa;
    this.wierzcholki = wierzcholki;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public Punkt[] getWierzcholki() {
    return wierzcholki;
  }

  public void setWierzcholki(Punkt[] wierzcholki) {
    this.wierzcholki = wierzcholki;
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
