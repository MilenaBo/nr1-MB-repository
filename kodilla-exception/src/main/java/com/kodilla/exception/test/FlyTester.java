package com.kodilla.exception.test;

public class FlyTester {
    public static void main(String[] args) {
        FindFlight testFindFlight = new FindFlight();

        testFindFlight.findFlight(new Flight("Okęcie", "Balice"));
        try {
            testFindFlight.findFlight(new Flight("Okęcie", "Bal"));
        } catch ( RouteNotFoundException e) {
            System.out.println("route not found ***");
        }
    }
}