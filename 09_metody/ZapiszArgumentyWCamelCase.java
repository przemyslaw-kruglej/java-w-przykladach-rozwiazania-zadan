public class ZapiszArgumentyWCamelCase {
  public static void main(String[] args) {
    System.out.println(doCamelCase(args));
  }

  public static String doCamelCase(String[] tab) {
    StringBuilder sb = new StringBuilder();

    for (String s : tab) {
      String strBezBialychZnakow = s.replaceAll("\\s", "");

      if (strBezBialychZnakow.isEmpty()) {
        continue;
      }

      if (sb.isEmpty()) {
        sb.append(strBezBialychZnakow.toLowerCase());
      } else {
        sb.append(
            Character.toUpperCase(strBezBialychZnakow.charAt(0))
        );
        sb.append(strBezBialychZnakow.substring(1).toLowerCase());
      }
    }

    return sb.toString();
  }
}
