package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class RentRequestRetriever {
    public RentRequest retrieve() {
        User user = new User( "John","Novak");
        LocalDateTime rentFrom = LocalDateTime.of(2020,6,2,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2020,6,3,12,0);

        return  new RentRequest(user,rentFrom,rentTo);
    }
}
