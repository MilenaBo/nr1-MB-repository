package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class BooksOrderService implements OrderService {
    public  boolean order(final User user,
                         final LocalDateTime bookOrderedFrom,
                         final LocalDateTime bookOrderedExecutedTo) {
        System.out.println(" **** BookOrderService ***  "+user.getName()+user.getSurname()
                +"  from "+bookOrderedFrom.toString()+"  to "+bookOrderedExecutedTo.toString());
        return true;
    }
}
