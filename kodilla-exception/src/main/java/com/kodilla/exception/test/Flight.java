package com.kodilla.exception.test;

public class Flight {

    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;   //odlot
        this.arrivalAirport = arrivalAirport;       //przylot
    }
    public String getDepartureAirport() {
        return departureAirport;
    }
    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
