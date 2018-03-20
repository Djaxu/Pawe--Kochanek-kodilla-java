package com.kodilla.testing.MainTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static long getCountEmptyStringUsingJava7(List<String> stringList){
        long result = stringList.stream()
                .filter(n->n.isEmpty())
                .count();
        return result;
    }
    public static long getCountLength3UsingJava7(List<String> lenghtList){

        long result = lenghtList.stream()
                .filter(n->n.length()== 3)
                .count();
        return result;
    }
    public static List<String> deleteEmptyStringsUsingJava7(List<String> deletedList){
        List<String> result = deletedList.stream()
                .filter(n->n.length() >0)
                .collect(Collectors.toList());
        return result;
    }
    public static String getMergedStringUsingJava7(List<String> mergedList,String name){
       String result = mergedList.stream()
               .filter(n->n.length() >0)
               .collect(Collectors.joining(name));
       return result;
    }
    public static List<Integer> getSquares(List<Integer> squareList){
        List<Integer> result = squareList.stream()
                .distinct()
                .map(n->n*n)
                .collect(Collectors.toList());
        return result;

    }
    public static Integer getMax(List<Integer> maxList){
        int result = maxList.stream()
                .mapToInt(n->n)
                .max()
                .getAsInt();
        return result;
    }
    public static Integer getMin(List<Integer> minList){
        int result = minList.stream()
                .mapToInt(n->n)
                .min()
                .getAsInt();
        return result;
    }
    public static Integer getSum(List<Integer> sumList){
        int result = sumList.stream()
                .mapToInt(n->n)
                .sum();
        return result;
    }
    public static Integer getAverage(List<Integer> avrList){
        int result =(int) avrList.stream()
                .mapToInt(n->n)
                .average().getAsDouble();
        return result;
    }
}
