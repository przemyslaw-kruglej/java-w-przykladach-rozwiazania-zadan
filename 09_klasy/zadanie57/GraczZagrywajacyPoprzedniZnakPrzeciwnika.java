package zadanie57;

public class GraczZagrywajacyPoprzedniZnakPrzeciwnika
    extends GraczPapierKamienNozyce {

  private Znak poprzedniZnakPrzeciwnika = Znak.losowyZnak();

  @Override
  public Znak graj() {
    return poprzedniZnakPrzeciwnika;
  }

  @Override
  public void rezultatGry(
      WynikGry wynikGry, Znak znakPrzeciwnika
  ) {
    poprzedniZnakPrzeciwnika = znakPrzeciwnika;
  }
}
