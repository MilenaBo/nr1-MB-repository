package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {

    public void createOrder(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("*********** BookOrderRepository  "+user.getName()+user.getSurname()
                +"  from "+from.toString()+"  to  "+to.toString());
           }
}
