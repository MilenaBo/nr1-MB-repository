package com.kodilla.good.patterns.challenges.food2door;

public class DistributionDto {

        public Customer customer;
        public Product product;
        public String validationProducer;
        public boolean isOrdered;

        public DistributionDto(final Customer customer,  final Product product,
                               final String validationProducer, final boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.isOrdered = isOrdered;
        this.validationProducer = validationProducer;
    }
        public Customer getCustomer()   {  return customer;     }
        public Product getProduct()     {  return product; }
        public boolean isOrdered()      { return isOrdered;  }
        public String getValidationProducer() {  return validationProducer;  }
}
