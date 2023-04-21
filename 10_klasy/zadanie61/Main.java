package zadanie61;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    Parking parking = new Parking();
    parking.dodajSamochod(new Samochod("Toyota", 2000, 180));
    parking.dodajSamochod(new Samochod("Renault", 2003, 180));
    parking.dodajSamochod(new Samochod("Toyota", 2023, 220));
    parking.dodajSamochod(new Samochod("Ford", 2010, 200));
    parking.dodajSamochod(new Samochod("Honda", 2020, 250));

    System.out.println(
        "Samochody marki Toyota: " +
            parking.znajdzSamochodyPoMarce("Toyota")
    );

    Optional<Samochod> najszybszy =
        parking.znajdzNajszybszySamochod();
    if (najszybszy.isPresent()) {
      System.out.println(
          "Najszybszy samochód: " + najszybszy.get()
      );
    } else {
      System.out.println("Parking jest pusty.");
    }

    System.out.println(
        "Samochody wyprodukowane przed 2010: " +
            parking.znajdzSamochodyWyprodukowanePrzed(2010)
    );
  }
}
