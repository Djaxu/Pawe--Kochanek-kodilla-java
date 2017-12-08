package com.kodilla.testing.Calculator;

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
    }
}
