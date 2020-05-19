package com.kodilla.stream.world;

import java.util.List;

// Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie

public class Continent {
    public List<Country> countries;
    String name;

    public Continent(List<Country> countries, String name) {
        this.countries = countries;
        this.name = name;
    }
    public List<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return name;
    }
}