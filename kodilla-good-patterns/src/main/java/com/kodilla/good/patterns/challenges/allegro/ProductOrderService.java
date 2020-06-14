package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderService {
    public static void main(String[] args) {

   //     OrderRequestExecuted orderRequestExecuted = new OrderRequestExecuted();
        OrderRequest orderRequest = OrderRequestExecuted.executed();

        OrderProcessor orderProcessor = new OrderProcessor(
        new MailService(),new BooksOrderService(), new BookOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
