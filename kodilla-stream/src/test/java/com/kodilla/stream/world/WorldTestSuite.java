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
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country(BigDecimal.valueOf(36000000),"Poland"));
        europe.addCountry(new Country(BigDecimal.valueOf(75000000),"Germany"));
        europe.addCountry(new Country(BigDecimal.valueOf(50000000),"France"));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country(BigDecimal.valueOf(1820000000),"China"));
        asia.addCountry(new Country(BigDecimal.valueOf(100000000), "Japan"));
        asia.addCountry(new Country(BigDecimal.valueOf(80000000), "Korea"));
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("2161000000");
        Assert.assertEquals(expectedPeople, peopleQuantity);


    }
}
