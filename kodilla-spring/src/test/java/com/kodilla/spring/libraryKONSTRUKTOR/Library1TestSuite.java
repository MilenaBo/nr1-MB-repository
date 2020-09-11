package com.kodilla.spring.libraryKONSTRUKTOR;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Library1TestSuite {

    @Test
    public void testContext1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Library1DbController.class);

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list of LibraryConfig====");
    }


    @Test
    public void testLoadFromDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library1 library = context.getBean(Library1.class);
        //When
        library.loadFromDb();
        //library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library1 library = context.getBean(Library1.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }
}

