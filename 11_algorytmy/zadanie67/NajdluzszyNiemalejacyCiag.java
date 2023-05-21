package zadanie67;

import java.io.*;

public class NajdluzszyNiemalejacyCiag {
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

      int aktualnaDlugosc = 1;
      int znalezionaNajwiekszaDlugosc = 1;
      int poprzedniaLiczba = Integer.parseInt(liczbyJakoTekst[0]);

      for (int k = 1; k < liczbyJakoTekst.length; k++) {
        int aktualnaLiczba = Integer.parseInt(liczbyJakoTekst[k]);

        if (poprzedniaLiczba <= aktualnaLiczba) {
          aktualnaDlugosc++;
        } else {
          znalezionaNajwiekszaDlugosc = Math.max(
              znalezionaNajwiekszaDlugosc, aktualnaDlugosc
          );
          aktualnaDlugosc = 1;
        }

        poprzedniaLiczba = aktualnaLiczba;
      }

      bw.write(String.valueOf(
          Math.max(znalezionaNajwiekszaDlugosc, aktualnaDlugosc))
      );
      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
