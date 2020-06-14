package com.kodilla.good.patterns.challenges.food2door;

public class MailService implements InformationService{

    public void inform(Customer customer) {
        System.out.println(" **** mail service ****  order from:   "+
                customer.getName()+customer.getSurname());
    }
}
