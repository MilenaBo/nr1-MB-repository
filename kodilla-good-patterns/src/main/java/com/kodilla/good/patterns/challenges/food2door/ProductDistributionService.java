package com.kodilla.good.patterns.challenges.food2door;
import java.time.LocalDateTime;

public class ProductDistributionService implements DistributionService {
    public  boolean order(final Customer customer,
    final LocalDateTime   OrderFrom,
    final LocalDateTime   OrderTo,
    final Product product,
    String validationProducer) {
        System.out.println("***  ProductDistributionService *** ordering by "+customer.getName()+customer.getSurname()
                +"  from "+  OrderFrom.toString());

                System.out.println("*** PRODUCT:  "+product.getProductName() + "   packages:  "+product.getQuantity());
        System.out.println("*** PRODUCER >>>  "+validationProducer);
        return true;
    }
}
