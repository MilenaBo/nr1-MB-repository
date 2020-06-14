package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public interface DistributionRepository {
    void createDistribution(Customer customer, LocalDateTime from, LocalDateTime to);
}