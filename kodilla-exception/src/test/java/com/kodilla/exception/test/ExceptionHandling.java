package com.kodilla.exception.test;

import javax.imageio.IIOException;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(8.5, 7.4);
        } catch (java.lang.Exception a){
            System.out.println("Problem !!");
        }
    }
}
