package com.kodilla.good.patterns.challenges.food2door;

public class DistributionProcessor {
    private InformationService informationService;
    private DistributionService distributionService;
    private DistributionRepository distributionRepository;
    private ProducerImplementationService producerImplementationService;

    public DistributionProcessor(final InformationService informationService,
                                 final DistributionService distributionService,
                                 final DistributionRepository distributionRepository,
                                 final ProducerImplementationService producerImplementationService) {
        this.informationService = informationService;
        this.distributionService = distributionService;
        this.distributionRepository = distributionRepository;
        this.producerImplementationService = producerImplementationService;
    }
    public DistributionDto process(final OrderRequest orderRequest) {
        boolean isOrdered = distributionService.order(orderRequest.getCustomer(),
                orderRequest.getFrom(), orderRequest.getTo(), orderRequest.getProduct(),
                orderRequest.getValidationProducer());
        if (isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            distributionRepository.createDistribution(orderRequest.getCustomer(),
                    orderRequest.getFrom(),orderRequest.getTo());
            ProducerService producerService = producerImplementationService.prepareImplementation();
            producerService.service("xx");
            return new DistributionDto(orderRequest.getCustomer(),orderRequest.getProduct(),
                    orderRequest.getValidationProducer(),true);
        }  else {
            return new DistributionDto(orderRequest.getCustomer(),orderRequest.getProduct(),
                    orderRequest.getValidationProducer(),false);
        }
    }
}
