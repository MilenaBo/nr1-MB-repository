package com.kodilla.spring.portfolio;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //given
        TaskList toDoList = new TaskList();
        TaskList inProgressList = new TaskList();
        TaskList doneList = new TaskList();



//      toDoList.getToDoList().add("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");
//      inProgressList.getTaskList2.getInProgress().add("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
//        doneList.getDoneList().add("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");

        System.out.println(toDoList);
        System.out.println(inProgressList);
        System.out.println(doneList);

//        System.out.println("***BEAN TODO***  ");
//        System.out.println(context.getBean("toDo",board.getToDoList()));
        System.out.println("   test2%%%%%%%%%%%%%  context.getBean(Board.class)");
        System.out.println(board);
    }

        @Test
        public void testTaskAddAndBEEN_S() {

        ArrayList toDoList = new ArrayList<>();
            ArrayList inProgressList = new ArrayList<>();
            ArrayList doneList = new ArrayList<>();

            toDoList.add("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");
            toDoList.add("nr 2 >>>>>>>>>>>>>>>>>  zadanie do zrobienia");
            inProgressList.add("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
            doneList.add("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");

            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);


            System.out.println("***BEAN BoardConfig***  ");
            System.out.println(context.containsBean("toDo"));
            System.out.println(context.containsBean("inProgress"));

            BoardConfig boardConfig = context.getBean(BoardConfig.class);
            boardConfig.getBoard();

            System.out.println("  test3!!!!!!!!!!!!!!!context.getBean(BoardConfig.class)");

            System.out.println(context.getBean("inProgress"));
            System.out.println();
        }
    }


