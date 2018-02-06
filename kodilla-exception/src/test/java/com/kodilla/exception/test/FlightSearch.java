package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warszawa",true);
        flightMap.put("Londyn", true);
        flightMap.put("Chicago", true);
        flightMap.put("Buenos Aires",true);
        if(flightMap.containsKey(flight)){
            System.out.println("Polaczenie mozeliwe");
        }
        return flightMap;

    }
}
