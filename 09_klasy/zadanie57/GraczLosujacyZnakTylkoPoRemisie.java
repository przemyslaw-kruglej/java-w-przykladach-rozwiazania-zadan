package zadanie57;

public class GraczLosujacyZnakTylkoPoRemisie
    extends GraczPapierKamienNozyce {

  private Znak znakDoPokazania = Znak.losowyZnak();

  @Override
  public Znak graj() {
    return znakDoPokazania;
  }

  @Override
  public void rezultatGry(
      WynikGry wynikGry, Znak znakPrzeciwnika
  ) {
    if (wynikGry == WynikGry.REMIS) {
      znakDoPokazania = Znak.losowyZnak();
    }
  }
}
