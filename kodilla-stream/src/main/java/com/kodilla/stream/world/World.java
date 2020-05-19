package com.kodilla.stream.world;

// Klasa World powinna zawierać kolekcję kontynentów
// W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
// która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów
// na wszystkich kontynentach.

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public void getPeopleQuantity() {
        BigDecimal totalPopulation = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //return totalPopulation;
    }
}

