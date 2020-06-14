package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class ProductDistributionRepository implements DistributionRepository {

    public void createDistribution(Customer customer, LocalDateTime from, LocalDateTime to) {
        System.out.println("***********  DistributionRepository  "+customer.getName()+
                customer.getSurname() + "  from " + from.toString()+"  to  "+to.toString());
    }
}
