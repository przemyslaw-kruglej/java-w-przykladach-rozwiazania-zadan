package zadanie70;

import java.io.*;

public class PodzialCiaguLiczbNaRowneSumy {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(System.out)
    );

    int liczbaZestawowWejsciowych =
        Integer.parseInt(br.readLine());

    for (int i = 0; i < liczbaZestawowWejsciowych; i++) {
      String[] liczbyJakoTekst = br.readLine().split(" ");
      int sumaLewo = 0;
      int sumaPrawo = 0;
      int lewo = 0;
      int prawo = liczbyJakoTekst.length - 1;

      while (lewo <= prawo) {
        if (sumaLewo <= sumaPrawo) {
          sumaLewo += Integer.parseInt(liczbyJakoTekst[lewo++]);
        } else {
          sumaPrawo += Integer.parseInt(liczbyJakoTekst[prawo--]);
        }
      }

      bw.write(sumaLewo == sumaPrawo ? String.valueOf(lewo) : "-1");
      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
