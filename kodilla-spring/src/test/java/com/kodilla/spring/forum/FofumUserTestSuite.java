package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@SpringBootTest
public class FofumUserTestSuite {

    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context =
             new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);
        //when
        String name = user.getUsername();
        //then
        Assert.assertEquals("John Smith",name);
    }
}
