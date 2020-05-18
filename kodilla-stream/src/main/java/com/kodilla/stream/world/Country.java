package com.kodilla.stream.world;

import java.math.BigDecimal;

// Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal.

public final class Country {
    private final String name;
    //private final String location;
    private final BigDecimal quantity;

    public Country(String name, BigDecimal quantity) {
        this.name = name;
        // this.location = location;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

//    public String getLocation() {
//        return location;
//    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getPeopleQuantity() {

        return quantity;
    }

}