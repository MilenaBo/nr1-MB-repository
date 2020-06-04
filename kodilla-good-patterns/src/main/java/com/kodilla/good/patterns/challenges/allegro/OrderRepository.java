package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from, LocalDateTime to);
}
