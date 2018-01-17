package com.kodilla.stream.array;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public interface ArrayOperations {
        static void  getAverage(int[] numbers){
            IntStream.range(0,numbers.length)
                    .forEach(System.out::println);
            OptionalDouble averageList= IntStream.range(0, numbers.length)
                    .average();
            System.out.println(averageList);
        }
}
