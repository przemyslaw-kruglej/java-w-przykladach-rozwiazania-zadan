import java.util.Scanner;

public class LiterySlowNaPrzemian {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String pierwszeSlowo = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String drugieSlowo = pobierzSlowo();

    System.out.printf(
        """
        Słowo powstałe z ustawienia na przemian \
        liter słów "%s" i "%s" to "%s"
        """,
        pierwszeSlowo,
        drugieSlowo,
        ustawZnakiNaPrzemian(pierwszeSlowo, drugieSlowo)
    );
  }

  public static String ustawZnakiNaPrzemian(String s1, String s2) {
    StringBuilder stringBuilder = new StringBuilder();
    int dlugoscKrotszegoStringa =
        Math.min(s1.length(), s2.length());
    String dluzszyString = s1.length() > s2.length() ? s1 : s2;

    for (int i = 0; i < dlugoscKrotszegoStringa; i++) {
      stringBuilder.append(s1.charAt(i)).append(s2.charAt(i));
    }
    stringBuilder.append(
        dluzszyString.substring(dlugoscKrotszegoStringa)
    );

    return stringBuilder.toString();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
