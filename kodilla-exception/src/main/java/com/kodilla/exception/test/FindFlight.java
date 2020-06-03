package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public boolean findFlight(Flight flight) {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Okęcie", false);
        airport.put("Charles de Gaulle", true);
        airport.put("Balice", true);

        boolean ifExist = false;

        if(airport.containsKey(flight.getDepartureAirport()) &&
            airport.containsKey(flight.arrivalAirport)) {
            ifExist=true;
        } else {
            throw new RouteNotFoundException();
        }
        return ifExist;
    }
}
