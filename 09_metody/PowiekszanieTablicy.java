import java.util.Arrays;

public class PowiekszanieTablicy {
  public static void main(String[] args) {
    int[] liczby = { 30, -5, 121 };

    int[] powiekszona = powiekszDwukrotnie(liczby);
    int[] powiekszonaDomyslnaWartosc =
        powiekszDwukrotnie(liczby, 5);

    System.out.println(Arrays.toString(powiekszona));
    System.out.println(
        Arrays.toString(powiekszonaDomyslnaWartosc)
    );
  }

  public static int[] powiekszDwukrotnie(int[] tab) {
    return Arrays.copyOf(tab, tab.length * 2);
  }

  public static int[] powiekszDwukrotnie(
      int[] tab, int domyslnaWartosc
  ) {
    int[] powiekszonaTablica = powiekszDwukrotnie(tab);
    Arrays.fill(
        powiekszonaTablica,
        tab.length,
        powiekszonaTablica.length,
        domyslnaWartosc
    );
    return powiekszonaTablica;
  }
}
