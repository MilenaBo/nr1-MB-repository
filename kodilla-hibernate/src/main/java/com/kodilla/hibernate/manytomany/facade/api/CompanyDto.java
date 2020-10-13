package com.kodilla.hibernate.manytomany.facade.api;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private final List<EmployeeDto> employees= new ArrayList<>();

    public void  addEmployee(final EmployeeDto employeeDto) { employees.add(employeeDto);}

    public List<EmployeeDto> getEmployees() { return  employees;}
}
