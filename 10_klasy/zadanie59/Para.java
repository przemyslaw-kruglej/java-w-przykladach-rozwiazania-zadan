package zadanie59;

public record Para<T, U>(T element1, U element2) {
  public static <T, U> Para<T, U> of(T element1, U element2) {
    return new Para<>(element1, element2);
  }

  public Para<U, T> zamienMiejscami() {
    return Para.of(element2, element1);
  }
}
