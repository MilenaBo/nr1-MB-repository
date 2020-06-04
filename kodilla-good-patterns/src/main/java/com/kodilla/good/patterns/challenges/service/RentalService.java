package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface RentalService {
    public boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
