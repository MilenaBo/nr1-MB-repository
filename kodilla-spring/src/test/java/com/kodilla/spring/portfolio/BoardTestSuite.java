package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
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
    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getDoneList().addTask("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");
        board.getInProgressList().addTask("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
        board.getToDoList().addTask("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");

        System.out.println("   test2%%%%%%%%%%%%%  context.getBean(Board.class)");

        //when
        ArrayList<String> doneList = new ArrayList<>();
        ArrayList<String> inProgressList = new ArrayList<>();
        ArrayList<String> toDoList = new ArrayList<>();
        doneList.add("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");
        inProgressList.add("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
        toDoList.add("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");

        System.out.println("board.getToDoList():       "+board.getToDoList());
        System.out.println("ArrayList<String> toDoList:   "+toDoList);

        //then
        Assert.assertEquals(board.getDoneList().getTasks(),doneList);
        Assert.assertEquals(board.getInProgressList().getTasks(),inProgressList);
        Assert.assertEquals(board.getToDoList().getTasks(),toDoList);
    }

        @Test
        public void testTaskAddAndBEEN_S() {

            ArrayList<String> doneList = new ArrayList<>();
            ArrayList<String> inProgressList = new ArrayList<>();
            ArrayList<String> toDoList = new ArrayList<>();
            doneList.add("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");
            inProgressList.add("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
            toDoList.add("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");

            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
            BoardConfig boardConfig = context.getBean(BoardConfig.class);

            System.out.println("***BEAN BoardConfig***  ");
            System.out.println(context.containsBean("toDo"));
            System.out.println(context.containsBean("inProgress"));
            System.out.println("  test3!!!!!!!!!!!!!!!context.getBean(BoardConfig.class)");
            System.out.println(context.getBean("inProgress"));
            System.out.println(context.getBean("toDo"));
            System.out.println(context.getBean("Done"));
            System.out.println();
        }
    }


