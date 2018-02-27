package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        ProductOrderService orderService = new ProductOrderService(new InformationServiceImpl(),new RentalService(),new RentalRepositoryImpl());
        User user1 = new User("Imie","Nazwisko");
        orderService.process(new RentRequest(user1, LocalDate.of(2018,1,25),LocalDate.of(2018,1,31)));

        MovieStore movieStore = new MovieStore();
        String names = movieStore.getMovies().values().stream()
                .flatMap(t->t.stream())
                .collect(Collectors.joining("!"));
        System.out.print(names);

    }
}
