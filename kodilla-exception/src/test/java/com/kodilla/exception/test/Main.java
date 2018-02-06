package com.kodilla.exception.test;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flight flights = new Flight("Warszawa","Poznan");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flights);
        } catch (RouteNotFoundException r) {
            System.out.println("Brak Mozliwych Polaczen");
        }
    }
}
