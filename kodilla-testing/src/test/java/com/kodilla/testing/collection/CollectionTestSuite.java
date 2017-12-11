package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

   /* @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    //@AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }*/
    @Test
    public void testEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.getNumbers();

        //Then
        Assert.assertArrayEquals(0, result);
    }
}
