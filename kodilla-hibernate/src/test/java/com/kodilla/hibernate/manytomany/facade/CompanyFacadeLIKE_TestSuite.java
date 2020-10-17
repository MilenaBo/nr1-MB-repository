package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.api.CompanyFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
// 24.1 zadanie
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeLIKE_TestSuite {
    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testCompanyFacade_LIKE() throws IOException {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        String companyNameLIKE = "soft";
        String employeeLastnameLIKE = "smi";

        List<Company> theLikeNameCompany = companyFacade.processCompany(companyNameLIKE);
        List<Employee> theLikeEmployes = companyFacade.processEmployee(employeeLastnameLIKE);

        //then
        companyFacade.processCompany(companyNameLIKE);
        Assert.assertNotEquals(0, theLikeNameCompany.size());
        System.out.println(theLikeNameCompany);

        companyFacade.processEmployee(employeeLastnameLIKE);
        Assert.assertNotEquals(0, theLikeEmployes.size());
        System.out.println(theLikeEmployes);

        }
        //cleanUp dziala V,
//            employeeDao.deleteAll();
//            companyDao.deleteAll();
}




