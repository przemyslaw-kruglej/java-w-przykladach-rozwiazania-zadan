package zadanie66;

import java.io.*;

public class BokiTrojkata {
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

      int a, b, c;
      a = Integer.parseInt(liczbyJakoTekst[0]);
      b = Integer.parseInt(liczbyJakoTekst[1]);

      for (int k = 2; k < liczbyJakoTekst.length; k++) {
        c = Integer.parseInt(liczbyJakoTekst[k]);

        if (czyBokiTrojkata(a, b, c)) {
          bw.write(a + " " + b + " " + c);
          break;
        } else if (k == liczbyJakoTekst.length - 1) {
          bw.write("-1");
        } else {
          a = b;
          b = c;
        }
      }

      bw.newLine();
    }

    br.close();
    bw.close();
  }

  public static boolean czyBokiTrojkata(int a, int b, int c) {
    return a + b > c && b + c > a && a + c > b;
  }
}
