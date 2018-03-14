package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testCreatingBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("roll")
                .burgers(2)
                .sauce("1000 wysp")
                .ingredients("cebula")
                .ingredients("pomidor")
                .build();
        //When
        //Then
        Assert.assertEquals(2,bigmac.getIngredients().size());
        Assert.assertEquals("1000 wysp",bigmac.getSauce());
        System.out.print(bigmac);
    }
}
