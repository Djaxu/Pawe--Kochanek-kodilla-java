package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<20;i++){
            numbers.add(i);
        }
        //When
        double result= ArrayOperations::getAverage;
        //Then
        Assert.assertEquals(9.5, result);




    }
}
