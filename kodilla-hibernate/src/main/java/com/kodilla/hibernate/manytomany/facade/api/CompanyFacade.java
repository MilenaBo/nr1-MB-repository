package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public final class CompanyFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public List<Company> processCompany(final String likeName) {

            List<Company> theLikeNameCompany = companyDao.retrieveLIKE_NameCompany(likeName);
            LOGGER.info("*** I AM FINDING COMPANIES LIKE " + likeName);
            if (theLikeNameCompany.size() == 0) {
                LOGGER.error(CompanyProcessingException.COMPANIES_NOT_EXIST);
                throw new CompanyProcessingException(CompanyProcessingException.COMPANIES_NOT_EXIST);
            }   try     {   System.out.println(theLikeNameCompany);
            }   finally {   LOGGER.info("*** CANCELLING FINDING COMPANIES LIKE " + likeName);
            } return theLikeNameCompany;
        }

        public List<Employee> processEmployee(final String likeLastName)
             {
        List<Employee> theLikeLastnameEmployees =  employeeDao.retrieveLIKE_Lastname(likeLastName);
        LOGGER.info("************ I'm finding employees LIKE "+likeLastName);
        if (theLikeLastnameEmployees.size() == 0) {
            LOGGER.error(CompanyProcessingException.EMPLOYEES_NOT_EXIST);
        throw  new CompanyProcessingException(CompanyProcessingException.EMPLOYEES_NOT_EXIST);
        }   try {     System.out.println(theLikeLastnameEmployees);
        } finally { LOGGER.info("*** CANCELLING FINDING COMPANIES LIKE "+likeLastName);
        }
        return theLikeLastnameEmployees;
        }
}
