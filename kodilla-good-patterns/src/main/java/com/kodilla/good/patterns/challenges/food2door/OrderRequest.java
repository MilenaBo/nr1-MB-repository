package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private LocalDateTime from;
    private LocalDateTime to;
    private Product product;
    private String validationProducer;

    public OrderRequest(final Customer customer, final LocalDateTime from, final LocalDateTime to,
                        final Product product, final String validationProducer) {
        this.customer = customer;
        this.from = from;
        this.to = to;
        this.product = product;
        this.validationProducer = validationProducer;
    }
    public Customer getCustomer() { return customer;    }
    public LocalDateTime getFrom() {  return from;     }
    public LocalDateTime getTo() {   return to;     }
    public Product getProduct() {  return product;     }
    public String getValidationProducer() {return validationProducer;  }
}
