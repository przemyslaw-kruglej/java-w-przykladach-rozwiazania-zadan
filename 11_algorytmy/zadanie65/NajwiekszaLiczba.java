package zadanie65;

import java.io.*;

public class NajwiekszaLiczba {
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

      long najwiekszaLiczba = Long.parseLong(liczbyJakoTekst[0]);
      int liczbaNajwiekszych = 1;

      for (int j = 1; j < liczbyJakoTekst.length; j++) {
        long liczba = Long.parseLong(liczbyJakoTekst[j]);

        if (liczba > najwiekszaLiczba) {
          najwiekszaLiczba = liczba;
          liczbaNajwiekszych = 1;
        } else if (liczba == najwiekszaLiczba) {
          liczbaNajwiekszych++;
        }
      }

      bw.write(najwiekszaLiczba + " " + liczbaNajwiekszych);
      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
