package com.kodilla.testing.Calculator;

public class Calculator {

    int a = 5;
    int b = 10;

    public int addMethod() {
        return b + a;
    }

    public int substractMethod() {
        return b - a;
    }
    public static void main(String args[]) {

        Calculator calculator = new Calculator();
        int result=calculator.addMethod();
        int subresult=calculator.substractMethod();
        System.out.println("wynik dodawania " + result+ "\n" + "wynik odejmowania " +subresult);
    }
}
