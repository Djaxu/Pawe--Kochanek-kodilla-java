package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface RentalRepository {

    boolean createRental(User user, LocalDate from, LocalDate to);
}
