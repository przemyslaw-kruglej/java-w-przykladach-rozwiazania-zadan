package zadanie57;

public class GraczZawszeZagrywajacyLosowyZnak
    extends GraczPapierKamienNozyce {

  @Override
  public Znak graj() {
    return Znak.losowyZnak();
  }

  @Override
  public void rezultatGry(
      WynikGry wynikGry, Znak znakPrzeciwnika
  ) {}
}
