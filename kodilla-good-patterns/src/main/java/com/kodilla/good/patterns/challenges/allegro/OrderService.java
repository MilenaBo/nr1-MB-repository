package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean order(User user, LocalDateTime from, LocalDateTime to);
}
