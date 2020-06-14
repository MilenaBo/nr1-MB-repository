package com.kodilla.good.patterns.challenges.food2door;

public class Food2Door {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        DistributionProcessor distributionProcessor = new DistributionProcessor(new MailService(),
                new ProductDistributionService(), new ProductDistributionRepository(),
                new ProducerImplementationService());
        distributionProcessor.process(orderRequest);
    }
}
