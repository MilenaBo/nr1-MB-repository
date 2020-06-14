package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String nameProducer;

    public Producer(final String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public static Producer getProducers() {
        List<Producer> producers = new ArrayList<Producer>();
        producers.add(new Producer("ExtraFoodShop"));
        producers.add(new Producer("HealthyShop"));
        producers.add(new Producer("GlutenFreeShop"));

        return getProducers();
    }
}
