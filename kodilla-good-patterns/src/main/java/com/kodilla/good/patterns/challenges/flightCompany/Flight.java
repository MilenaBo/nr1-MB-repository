package com.kodilla.good.patterns.challenges.flightCompany;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {
    String flightNumber;
    String flightType; /** arrival/departure */
    String flightFrom;
    String flightTo;
    LocalDateTime timeFlightFrom;
    LocalDateTime timeFlightTo;

    public Flight(final String flightNumber, final String flightType,
                  final String flightFrom, final String flightTo,
                  final LocalDateTime timeFlightFrom, final LocalDateTime timeFlightTo) {
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.timeFlightFrom = timeFlightFrom;
        this.timeFlightTo = timeFlightTo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return flightNumber.equals(flight.flightNumber) &&
                flightType.equals(flight.flightType) &&
                flightFrom.equals(flight.flightFrom) &&
                flightTo.equals(flight.flightTo) &&
                timeFlightFrom.equals(flight.timeFlightFrom) &&
                timeFlightTo.equals(flight.timeFlightTo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, flightType, flightFrom, flightTo,
                timeFlightFrom, timeFlightTo);
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getFlightType() {
        return flightType;
    }
    public String getFlightFrom() {
        return flightFrom;
    }
    public String getFlightTo() {
        return flightTo;
    }
    public LocalDateTime getTimeFlightFrom() {
        return timeFlightFrom;
    }
    public LocalDateTime getTimeFlightTo() {
        return timeFlightTo;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", flightType='" + flightType + '\'' +
                ", flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                ", timeFlightFrom=" + timeFlightFrom +
                ", timeFlightTo=" + timeFlightTo +
                '}';
    }
}
