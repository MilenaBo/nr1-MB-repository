package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public interface DistributionService {
    public boolean order(Customer customer, LocalDateTime from, LocalDateTime to,
                         Product product, String validationProducer);
}