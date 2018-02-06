package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentalRepositoryImpl implements RentalRepository {

    public boolean createRental(User user, LocalDate from, LocalDate to){
        System.out.println("Rental implemented");
        return true;
    }
}
