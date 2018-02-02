package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private List<Country> listOfCountries  = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
    public void addCountry(Country country){
        listOfCountries.add(country);
    }
}
