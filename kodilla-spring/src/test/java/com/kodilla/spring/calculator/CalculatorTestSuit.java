package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuit {

    @Test
    public void testAdd() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double wynik = calculator.add(3,4);


        //Then
     Assert.assertEquals(7,wynik,0.001);
    }

    @Test
    public void testSub() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double wynik = calculator.sub(8,2);

        //Then
        Assert.assertEquals(6,wynik,0.001);
    }

    @Test
    public void testMul() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double wynik = calculator.mul(1,5);

        //Then
        Assert.assertEquals(5,wynik,0.001);
    }

    @Test
    public void testDiv() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double wynik = calculator.div(8,2);

        //Then
        Assert.assertEquals(4,wynik,0.001);
    }


}
