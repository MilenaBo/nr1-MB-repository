package com.kodilla.hibernate.manytomany.facade.api;

public class CompanyProcessingException extends Exception {

    public static String COMPANIES_NOT_EXIST = "THOSE COMPANIES NOT EXIST";
    public static String EMPLOYEES_NOT_EXIST = "there are no employees";

    public CompanyProcessingException (String message) {
        super(message);
    }

}
