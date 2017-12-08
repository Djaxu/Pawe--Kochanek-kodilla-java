package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.addMethod();
        int result2 = calculator.substractMethod();

        if (result == 5) {
            System.out.println("Test Ok");
        } else {
            System.out.println("ERROR");
        }
        if (result2 == 5) {
            System.out.println("Test 2 OK");
        } else {
            System.out.println("ERROR 2 ");
        }
    }
}
