package zadanie61;

import java.util.*;

public class Parking {
  private final List<Samochod> samochody = new ArrayList<>();

  public void dodajSamochod(Samochod samochod) {
    Objects.requireNonNull(
        samochod, "Samochód nie może być nullum."
    );
    samochody.add(samochod);
  }

  public List<Samochod> znajdzSamochodyPoMarce(String marka) {
    return samochody.stream()
        .filter(
            samochod -> samochod.marka().equalsIgnoreCase(marka)
        )
        .toList();
  }

  public Optional<Samochod> znajdzNajszybszySamochod() {
    return samochody.stream()
        .max(Comparator.comparingInt(Samochod::maksymalnaSzybkosc));
  }

  public List<Samochod> znajdzSamochodyWyprodukowanePrzed(
      int rokProdukcji
  ) {
    return samochody.stream()
        .filter(samochod -> samochod.rokProdukcji() < rokProdukcji)
        .toList();
  }
}
