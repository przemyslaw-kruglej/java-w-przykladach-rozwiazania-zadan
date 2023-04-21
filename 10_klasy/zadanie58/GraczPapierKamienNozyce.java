package zadanie58;

public abstract class GraczPapierKamienNozyce {
  public abstract Znak graj();

  public abstract void rezultatGry(
      WynikGry wynikGry, Znak znakPrzeciwnika
  );
}
