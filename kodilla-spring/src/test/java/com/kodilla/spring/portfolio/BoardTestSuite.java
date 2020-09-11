package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testContext() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        // when
        System.out.println("BEANS>>>>>>>>>>>>>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<<<<<<<<<<<<BEANS");
    }
//    @Test
//    public void testTaskAdd() {
//        //given
//        List<String> task1 = new ArrayList<>();
//        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
//    }

}
