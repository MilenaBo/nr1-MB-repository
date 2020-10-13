package com.kodilla.hibernate.manytomany.facade.api;

public final class EmployeeDto {
    private int id;
    private final String firstname;
    private final String lastname;

    public EmployeeDto(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
