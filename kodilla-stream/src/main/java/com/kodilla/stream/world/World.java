package com.kodilla.stream.world;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }
    public void addContinent(Continent continent){
        continents.add(continent);
    }
    BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(i->i.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sume, current)->sume=sume.add(current));
    }
}
