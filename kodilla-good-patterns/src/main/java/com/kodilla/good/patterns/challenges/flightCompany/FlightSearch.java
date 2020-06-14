package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.stream.Collectors;

public class FlightSearch {
    public static void main(String[] args)  {

        System.out.println("<<<  1.  ALL FLIGHTS  >>>");
        FlightMap.getFlights().values().stream()
                .flatMap(FlightsList1 ->FlightsList1.stream())
                .map(Flight::toString)
                .forEach(System.out::println);

        System.out.println("<<<  FROM GDANSK  >>>");
        String theResultOfSearchFromGdansk =
                FlightMap.getFlights().values().stream()
                        .flatMap(FlightsList ->FlightsList.stream())
                        .filter(s -> (s.flightFrom == "GDANSK") && (s.flightType =="departure") )
                        .map(Flight::toString)
                        .collect(Collectors.joining("!!!","<<",">>"));
        System.out.println(theResultOfSearchFromGdansk);

        System.out.println("<<<  TO KRAKOW  >>>");
        FlightMap.getFlights().values().stream()
                .flatMap(FlightsList ->FlightsList.stream())
                .filter(s -> (s.flightTo == "KRAKOW") && (s.flightType =="arrived"))
                .map(Flight::toString)
                .forEach(System.out::println);

        System.out.println("<<<  FROM GDANSK // KRAKOW // TO WROCLAW >>>");
        FlightMap.getFlights().values().stream()
                .flatMap(FlightsList ->FlightsList.stream())
                .filter(s -> ((s.flightFrom == "GDANSK") && (s.flightTo == "KRAKOW") && (s.flightType == "departure")) ||
                        (s.flightFrom == "KRAKOW") && (s.flightTo == "WROCLAW") && (s.flightType == "departure"))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

}
