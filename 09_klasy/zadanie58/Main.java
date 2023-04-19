package zadanie58;

public class Main {
  public static void main(String[] args) {
    Para<String, Integer> para =
        new Para<>("strona", 42);

    Para<String, String> najlepsiPrzyjaciele =
        Para.of("pies", "kot");

    Para<Integer, String> innaPara = para.zamienMiejscami();

    System.out.println(para);
    System.out.println(najlepsiPrzyjaciele);
    System.out.println(innaPara);
  }
}
