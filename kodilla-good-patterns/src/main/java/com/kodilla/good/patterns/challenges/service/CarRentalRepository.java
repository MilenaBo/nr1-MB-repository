package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public void createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("*********** CarRentalRepository  "+user.getName()+user.getSurname()
                +"  from "+from.toString()+"  to  "+to.toString());
    }
}
