package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    public static void main(String[] args)  {

        System.out.println("<<<  1.  ALL FLIGHTS  >>>");
        FlightMap.getFlights().values().stream()
                .flatMap(FlightsList1 ->FlightsList1.stream())
                .map(Flight::toString)
                .forEach(System.out::println);

        System.out.println("<<<  2. FROM GDANSK  >>>");
        FlightMap.getFlights().values().stream()
                 .flatMap(FlightsList ->FlightsList.stream())
                 .filter(s -> (s.flightFrom.equals("GDANSK")) && (s.flightType.equals("departure")))
                 .map(Flight::toString)
                 .forEach(System.out::println);

        System.out.println("<<<  3. TO KRAKOW  >>>");
        FlightMap.getFlights().values().stream()
                .flatMap(FlightsList ->FlightsList.stream())
                .filter(s -> (s.flightTo.equals("KRAKOW")) && (s.flightType.equals("arrived")))
                .map(Flight::toString)
                .forEach(System.out::println);

        System.out.println("<<<  FROM GDANSK // CHANGE // TO WROCLAW >>>");
        List<Flight> collect = FlightMap.getFlights().values().stream()
                .flatMap(FlightsList -> FlightsList.stream())
                .filter(s -> ((s.flightFrom.equals("GDANSK")) && (s.flightType.equals("departure"))))
                .collect(Collectors.toList());

        List<String> collect1 = FlightMap.getFlights().values().stream()
                .flatMap(FlightsList -> FlightsList.stream())
                .filter(s ->((s.flightTo.equals("WROCLAW")) && (s.flightType.equals("arrived"))))
                .map(Flight::getFlightFrom)
                .collect(Collectors.toList());

        collect.stream().filter(s -> collect1.contains(s.flightTo))
                .map(Flight::getFlightTo)
             .forEach(System.out::println);
    }
}
