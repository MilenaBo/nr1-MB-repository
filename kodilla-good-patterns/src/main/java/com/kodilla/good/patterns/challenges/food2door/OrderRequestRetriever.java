package com.kodilla.good.patterns.challenges.food2door;
import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer( "John","Novak");
        LocalDateTime orderFrom = LocalDateTime.of(2020,6,2,12,0);
        LocalDateTime orderTo = LocalDateTime.of(2020,6,3,12,0);
        Product product = new Product("TRUSKAWKI", 2);
        String validationProducer;
        validationProducer = "ExtraFoodShop";


        return  new OrderRequest(customer,orderFrom,orderTo,product,validationProducer);
    }
}
