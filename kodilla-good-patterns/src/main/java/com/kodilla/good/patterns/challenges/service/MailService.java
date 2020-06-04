package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService{

    public void inform(User user) {
        System.out.println(" **** mail service from/to:   "+user.getName()+user.getSurname());
    }
}
