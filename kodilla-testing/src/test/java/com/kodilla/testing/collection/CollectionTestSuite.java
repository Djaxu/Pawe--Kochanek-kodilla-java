package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

     @Before
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
     @AfterClass
     public static void afterClass() {
         System.out.println("Test Suite: end");
     }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(list);

        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(expectedList, result);

    }
    @Test
    public void testOneNumberEven(){
         //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        //When
        ArrayList<Integer> result= oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(1, result.size());
        int expected=result.get(0);
        Assert.assertEquals(2, expected);
    }
    @Test
    public void testOneNumberOdd(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        //When
        ArrayList<Integer> result= oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(0, result.size());


    }

}
