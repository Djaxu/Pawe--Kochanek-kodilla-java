package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentalService {

    public boolean rent(final User user, final LocalDate carRentFrom, final LocalDate carRentTo){
        if(carRentFrom.isBefore(carRentTo)){
            System.out.println("Car rented for "+ user.getUserName() +user.getUserSurname() + " from " + carRentFrom.toString() + " to "+ carRentTo.toString());
            return true;
        }
        System.out.println("Car wont be rented");
        return false;
    }
}
