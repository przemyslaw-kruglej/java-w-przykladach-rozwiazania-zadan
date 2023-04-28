package zadanie69;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IndeksyPierwszejParyLiczb {
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
      Map<String, Integer> indeksyLiczb = new HashMap<>();

      String[] liczbyJakoTekst = br.readLine().split(" ");

      for (int k = 0; k < liczbyJakoTekst.length; k++) {
        if (indeksyLiczb.containsKey(liczbyJakoTekst[k])) {
          bw.write(
              indeksyLiczb.get(liczbyJakoTekst[k]) + " " + k
          );
          break;
        } else if (k == liczbyJakoTekst.length - 1) {
          bw.write("-1");
        } else {
          indeksyLiczb.put(liczbyJakoTekst[k], k);
        }
      }

      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
