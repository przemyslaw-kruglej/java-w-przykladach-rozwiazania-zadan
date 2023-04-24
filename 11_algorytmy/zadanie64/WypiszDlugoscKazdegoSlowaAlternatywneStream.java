package zadanie64;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class WypiszDlugoscKazdegoSlowaAlternatywneStream {
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
      bw.write(
          Arrays.stream(br.readLine().split(" "))
              .map(String::length)
              .map(String::valueOf)
              .collect(Collectors.joining(" "))
      );
      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
