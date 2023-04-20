package zadanie54.poprawione;

public class Punkt {
  public final int x, y;

  public Punkt(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("Punkt[x=%d, y=%d]", x, y);
  }
}
