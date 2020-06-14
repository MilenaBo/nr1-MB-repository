package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;

public final class FlightMap {

    public static Map<String, List<Flight>> getFlights() {

        Flight flight123a = new Flight("123", "arrived",
                "WROCLAW", "GDANSK",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 13, 0));
        Flight flight125a = new Flight("125", "arrived",
                "KRAKOW", "GDANSK",
                LocalDateTime.of(2020, 6, 15, 13, 0),
                LocalDateTime.of(2020, 6, 15, 14, 0));
        Flight flight128d= new Flight("128", "departure",
                "GDANSK", "KRAKOW",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 12, 30));

        final List<Flight> gdanskAirPort = new ArrayList<>();
        gdanskAirPort.add(flight123a);
        gdanskAirPort.add(flight125a);
        gdanskAirPort.add(flight128d);

        Flight flight124a= new Flight("124", "arrived",
                "WROCLAW", "KRAKOW",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 12, 30));
        Flight flight128a= new Flight("128", "arrived",
                "GDANSK", "KRAKOW",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 12, 30));
        Flight flight125d = new Flight("125", "departure",
                "KRAKOW", "GDANSK",
                LocalDateTime.of(2020, 6, 15, 13, 0),
                LocalDateTime.of(2020, 6, 15, 14, 0));
        Flight flight129d= new Flight("129", "departure",
                "KRAKOW", "WROCLAW",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 12, 30));
        Flight flight130d= new Flight("130", "departure",
                "KRAKOW", "WROCLAW",
                LocalDateTime.of(2020, 6, 15, 22, 0),
                LocalDateTime.of(2020, 6, 15, 22, 30));

        final List<Flight> krakowAirPort = new ArrayList<>();
        krakowAirPort.add(flight124a);
        krakowAirPort.add(flight128a);
        krakowAirPort.add(flight129d);
        krakowAirPort.add(flight130d);

        Flight flight123d = new Flight("123", "departure",
                "WROCLAW", "GDANSK",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 13, 0));
        Flight flight124d= new Flight("124", "departure",
                "WROCLAW", "KRAKOW",
                LocalDateTime.of(2020, 6, 15, 12, 0),
                LocalDateTime.of(2020, 6, 15, 12, 30));
        Flight flight130a= new Flight("130", "arrived",
                "KRAKOW", "WROCLAW",
                LocalDateTime.of(2020, 6, 15, 22, 0),
                LocalDateTime.of(2020, 6, 15, 22, 30));

        final List<Flight> wroclawAirPort = new ArrayList<>();
        wroclawAirPort.add(flight123d);
        wroclawAirPort.add(flight124d);
        wroclawAirPort.add(flight130a);

        final Map<String, List<Flight>> flights =new HashMap<>();

        flights.put("GDANSK",gdanskAirPort);
        flights.put("KRAKOW",krakowAirPort);
        flights.put("WROCLAW",wroclawAirPort);

        return flights;
    }
}