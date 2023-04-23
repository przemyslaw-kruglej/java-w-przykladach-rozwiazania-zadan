package zadanie64;

import java.io.*;

public class WypiszDlugoscKazdegoSlowa {
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
      String[] slowa = br.readLine().split(" ");
      StringBuilder sb = new StringBuilder();

      for (String slowo : slowa) {
        sb.append(slowo.length()).append(" ");
      }

      bw.write(sb.toString().trim());
      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
