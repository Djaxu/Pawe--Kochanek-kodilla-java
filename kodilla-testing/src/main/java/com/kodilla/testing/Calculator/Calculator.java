package com.kodilla.testing.Calculator;

import java.util.*;

public class Calculator {

    public int add(int a, int b ) {
        return b + a;
    }

    public int substract(int a, int b) {
        return b - a;
    }
    public static void main(String args[]) {

        Calculator calculator = new Calculator();
        int result=calculator.add(5,5);
        int subresult=calculator.substract(15,1);
        System.out.println("wynik dodawania " + result+ "\n" + "wynik odejmowania " +subresult);

        Scanner scanner= new Scanner(System.in);
//        int liczba=scanner.nextInt();
//        System.out.println("wprowadzona liczba : "+ liczba);

        HashSet<Integer> userNumbers = new HashSet<>();
        while (userNumbers.size()<6){
            int tempInt= scanner.nextInt();
            if(tempInt<50&&tempInt>0) {
                userNumbers.add(tempInt);
            }
        }
        System.out.println(userNumbers);
        Random rng = new Random();
        HashSet<Integer> lottoResults = new HashSet<>();
        while (lottoResults.size()<6){
            lottoResults.add(rng.nextInt(49)+1);

        }
        System.out.println(lottoResults);
        int tryCounter =0;
        for(Integer oneNumberResult: userNumbers ){
            if(lottoResults.contains(oneNumberResult)){
                tryCounter++;
            }

        }
        System.out.println("sprawdzone liczby to : " + tryCounter);
    }


}
