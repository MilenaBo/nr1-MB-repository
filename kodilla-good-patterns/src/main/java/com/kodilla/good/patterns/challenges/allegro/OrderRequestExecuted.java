package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequestExecuted {

    public static OrderRequest executed() {

        User user = new User( "John","Novak");

        LocalDateTime orderFrom = LocalDateTime.of(2020,6,2,12,0);
        LocalDateTime orderTo = LocalDateTime.of(2020,6,3,12,0);

        return  new OrderRequest(user,orderFrom,orderTo);
    }
}
