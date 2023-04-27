package zadanie68;

import java.io.*;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CiagiTakichSamychLiczb {
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
      Set<String> dane1BezDuplikatow =
          Stream.of(br.readLine().split(" "))
              .collect(toSet());

      Set<String> dane2BezDuplikatow =
          Stream.of(br.readLine().split(" "))
              .collect(toSet());

      bw.write(
          dane1BezDuplikatow.equals(dane2BezDuplikatow) ? "1" : "0"
      );
      bw.newLine();
    }

    br.close();
    bw.close();
  }
}
