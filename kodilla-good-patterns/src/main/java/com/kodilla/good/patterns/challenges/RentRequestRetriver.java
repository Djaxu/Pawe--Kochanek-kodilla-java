package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RentRequestRetriver {

    public RentRequest retrive(String userName, String surname,LocalDate from,LocalDate to) {
        User user = new User(userName,surname);
        return new RentRequest(user, from, to);
    }
}
