package com.kodilla.stream.array;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface ArrayOperations {
        static void  getAverage(int[] numbers){
            IntStream.range(0,numbers.length)
                    .forEach(System.out::println);
            double averageList= IntStream.range(0, numbers.length)
                    .average();
            System.out.println(averageList);
        }
}
