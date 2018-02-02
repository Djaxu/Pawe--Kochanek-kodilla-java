package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testHowManyPeople(){
        //Given
        List<Country> europe = new ArrayList<>();
        europe.add(1, new Country(BigDecimal.valueOf(36000000),"Poland"));
        europe.add(2, new Country(BigDecimal.valueOf(75000000),"Germany"));
        europe.add(3, new Country(BigDecimal.valueOf(50000000),"France"));
        List<Country> asia = new ArrayList<>();
        asia.add(1,new Country(BigDecimal.valueOf(1820000000),"China"));
        asia.add(2,new Country(BigDecimal.valueOf(100000000), "Japan"));
        asia.add(3,new Country(BigDecimal.valueOf(80000000), "Korea"));
        List<Continent> world = new ArrayList<>();
        world.add(1, new Continent("europe"));
        world.add(2,new Continent("asia"));
        //When
        BigDecimal peopleQuantity = world.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(i->i.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sume, current)->sume=sume.add(current));
        //Then
        BigDecimal expectedPeople = new BigDecimal("2111111109037");
        Assert.assertEquals(peopleQuantity, expectedPeople);


    }
}
