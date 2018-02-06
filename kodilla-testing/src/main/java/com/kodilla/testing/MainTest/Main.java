package com.kodilla.testing.MainTest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static long getCountEmptyStringUsingJava7(List<String> stringList){
        int counter=0;
        for (String temp: stringList ){
            if(temp.isEmpty()){
                counter++;
            }
        }
        return counter;
    }
    public static long getCountLength3UsingJava7(List<String> lenghtList){
        int tryCounter=0;
        for (String temp: lenghtList){
            if (temp.length() ==3){
                tryCounter++;
            }
        }
        return tryCounter;
    }
    public static List<String> deleteEmptyStringsUsingJava7(List<String> deletedList){
        return new ArrayList<>();
    }
    public static String getMergedStringUsingJava7(List<String> mergedList,String name){
        return "";
    }
    public static List<Integer> getSquares(List<Integer> squareList){
        return new ArrayList<>();
    }
    public static Integer getMax(List<Integer> maxList){
        return 9;
    }
    public static Integer getMin(List<Integer> minList){
        return 9;
    }
    public static Integer getSum(List<Integer> sumList){
        return 9;
    }
    public static Integer getAverage(List<Integer> sumList){
        return 78;
    }



}
