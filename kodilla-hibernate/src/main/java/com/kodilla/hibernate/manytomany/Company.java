package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedNativeQueries({
        //zadanie 24.5
        @NamedNativeQuery(
                name = "Company.retrieveLIKE_NameCompany",
                //query = "SELECT * FROM kodilla_course.companies WHERE company_name LIKE '%'+'soft'+'%'; ",
                query = "SELECT * FROM kodilla_course.companies WHERE company_name LIKE concat('%',:ARG,'%');",
                resultClass = Company.class
        ),
        //zadanie 17.4
        @NamedNativeQuery(
                name = "Company.retrieveCompany3Char",
                query = "SELECT * FROM COMPANIES WHERE LEFT(COMPANY_NAME,'3') ='Sof'",
                resultClass = Company.class
        )
})
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")

    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {      }
    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }
    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
