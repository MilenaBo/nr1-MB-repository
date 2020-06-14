package com.kodilla.good.patterns.challenges.food2door;

public class ProducerImplementationService {

  //  private ProducerImplementationService producerImplementationService;

//    public ProducerImplementationService() {
//        this.producerImplementationService = producerImplementationService;
//    }
//
//    public ProducerImplementationService getProducerImplementationService() {
//        return producerImplementationService;
//    }

    public ProducerService prepareImplementation() {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        if (orderRequest.getValidationProducer() == "ExtraFoodShop") {
            return new ProducerExtraFoodShopService();
        }
        return new ProducerStandardShopService();

    }
}