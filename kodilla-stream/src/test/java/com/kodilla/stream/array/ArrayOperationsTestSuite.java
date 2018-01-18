package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbrsArray = new int[10];
        numbrsArray[0] = 7;
        numbrsArray[1] = 78;
        numbrsArray[2] = 56;
        numbrsArray[3] = 45;
        numbrsArray[4] = 96;
        numbrsArray[5] = 55;
        numbrsArray[6] = 12;
        numbrsArray[7] = 1;
        numbrsArray[8] = 3;
        numbrsArray[9] = 99;


        //When
        double result = ArrayOperations.getAverage(numbrsArray);
        //Then
        Assert.assertEquals(45.2, result,0.001);
    }

}
