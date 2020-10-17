package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
//import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
import com.kodilla.hibernate.manytomany.facade.api.CompanyFacade;
import com.kodilla.hibernate.manytomany.facade.api.CompanyProcessingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyFacade companyFacade;

    @Test
    public void testSaveManyToMany(){
        //Given
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

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void CompanyDaoTestSuite() {
   //     CompanyDto companyDto = new CompanyDto();
     //  EmployeeDto employeeDto = null;
        //Given
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

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

//       //then
        List<Employee> theEmployees = employeeDao.retrieveLastname("Smith");
        List<Company> theCompanies = companyDao.retrieveCompany3Char();
        //24.1 to dziala  v
       List<Company> theLikeNameCompany = companyFacade.processCompany("soft");
//        List<Employee> employeesLike = employeeDao.retrieveLIKE_Lastname("smi");

        try{
            Assert.assertNotEquals(0,theEmployees.size());
            Assert.assertNotEquals(0,theCompanies.size());
            //24.1 to dziala  v
       Assert.assertNotEquals(0,theLikeNameCompany.size());

//companyFacade.processEmployee(companyDto.getEmployees(),"smi");
       //24.1 str21, linia 74
            companyFacade.processCompany("soft");
        } catch (CompanyProcessingException e) {
            e.printStackTrace();
        } finally {
            //cleanUp dziala, ale nie po id
//            employeeDao.deleteAll();
//            companyDao.deleteAll();
        }
        List<Employee> theLikeEmployes = companyFacade.processEmployee("smi");
       Assert.assertNotEquals(0,theLikeEmployes.size());
    }
}
