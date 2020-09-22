package com.kodilla.patterns22.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId) {
        Random gererator = new Random();
        return new BigDecimal(gererator.nextInt(100000) / 100);
    }
}
