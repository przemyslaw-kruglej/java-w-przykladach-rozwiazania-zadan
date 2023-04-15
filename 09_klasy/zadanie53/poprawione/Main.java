package zadanie53.poprawione;

public class Main {
  public static void main(String[] args) {
    Punkt p1 = new Punkt(10, 20);
    Punkt p2 = new Punkt(50, 20);
    Punkt p3 = new Punkt(30, 40);
    Punkt[] wierzcholki = new Punkt[] { p1, p2, p3 };

    Figura figura = new Figura("Trójkąt", wierzcholki);
    System.out.println(figura);

    wierzcholki[0] = new Punkt(0, 0);
    Punkt[] wierzcholkiFigury = figura.getWierzcholki();
    wierzcholkiFigury[1] = new Punkt(60, 30);

    System.out.println(figura);
  }
}
