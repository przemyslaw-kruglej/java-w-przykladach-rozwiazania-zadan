public class NajdluzszyArgumentProgramu {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Brak argumentów.");
    } else {
      String najdluzszy = args[0];

      for (int i = 1; i < args.length; i++) {
        if (najdluzszy.length() < args[i].length()) {
          najdluzszy = args[i];
        }
      }

      System.out.println(najdluzszy);
    }
  }
}
