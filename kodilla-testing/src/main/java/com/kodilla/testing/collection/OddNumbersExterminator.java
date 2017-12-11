package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

     class OddNumbersExterminator {
             ArrayList<Integer> numbers = new ArrayList<>();


            exterminator(ArrayList<Integer> numbers) {
            this.numbers = numbers;
            }
            public ArrayList<Integer> getNumbers(){
                return this.numbers;
            }
         }

     /*      Random rng = new Random();
             ArrayList<Integer> numbers = new ArrayList<Integer>();
             for (int i = 0; i < 50; i++) {
                 numbers.add(rng.nextInt(99));
             }
             System.out.println("Wielkosc listy numbers " + numbers.size());
             */