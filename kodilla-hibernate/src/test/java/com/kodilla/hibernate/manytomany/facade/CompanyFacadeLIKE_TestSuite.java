package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
import com.kodilla.hibernate.manytomany.facade.api.CompanyFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeLIKE_TestSuite {
    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void testCompanyFacade_LIKE() {
        CompanyDto companyDto = new CompanyDto();

    }

}
