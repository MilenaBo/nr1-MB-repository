package com.kodilla.good.patterns.challenges.food2door;

public class ProducerImplementationService {

    public ProducerService prepareImplementation() {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        if (orderRequest.getValidationProducer().equals("ExtraFoodShop")) {
            return new ProducerExtraFoodShopService();
        }
        if (orderRequest.getValidationProducer().equals("GlutenFreeShop")) {
            return new ProducerExtraFoodShopService();
        }
        if (orderRequest.getValidationProducer().equals("HealthyShop")) {
            return new ProducerExtraFoodShopService();
        }
        if (orderRequest.getValidationProducer().equals("NewFoodShop")) {
            return new ProducerNewFoodShopService();
        }
        return new ProducerStandardShopService();

    }
}