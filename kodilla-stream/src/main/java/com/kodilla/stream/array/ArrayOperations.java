package com.kodilla.stream.array;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public interface ArrayOperations {
        static double  getAverage(int[] numbers){
            IntStream.range(0,numbers.length)
                    .map(a->numbers[a])
                    .forEach(System.out::println);
            double averageList= IntStream.range(0, numbers.length)
                    .map(a->numbers[a])
                    .average().getAsDouble();
            System.out.println(averageList);
            return averageList;
        }
}
