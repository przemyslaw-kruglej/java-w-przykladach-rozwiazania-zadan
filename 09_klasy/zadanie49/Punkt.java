package zadanie49;

import java.util.Objects;

public class Punkt {
  private int x, y;

  public Punkt(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("Punkt[x=%d, y=%d]", x, y);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Punkt punkt = (Punkt) o;
    return x == punkt.x && y == punkt.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
