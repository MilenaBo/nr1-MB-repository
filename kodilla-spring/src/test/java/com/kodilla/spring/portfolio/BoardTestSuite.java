package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
     //  TaskList toDoList = new TaskList();
//        TaskList toDoList2 = new TaskList();
      List<String> toDoList = new ArrayList<>();
        List<String> inProgressList = new ArrayList<>();
        List<String> doneList = new ArrayList<>();
        toDoList.add("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");
        toDoList.add("nr 2 >>>>>>>>>>>>>>>>>  zadanie do zrobienia");
        inProgressList.add("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
        doneList.add("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");

        System.out.println(toDoList);
        System.out.println(inProgressList);
        System.out.println(doneList);

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
Board board = context.getBean(Board.class);
        System.out.println("***BEAN TODO***  ");
     //   System.out.println(context.getBean("toDo",board.getToDoList()));

      //  BoardConfig board = context.getBean(BoardConfig.class);
        System.out.println("   test2%%%%%%%%%%%%%  context.getBean(Board.class)");
        System.out.println(board.getToDoList());
        System.out.println(board);
    }

        @Test
        public void testTaskAddAndBEEN() {
            //given

            TaskList toDoList = new TaskList();
            TaskList inProgressList = new TaskList();
            TaskList doneList = new TaskList();
            Board board= new Board(toDoList,inProgressList,doneList);



//            //board.getToDoList().("nr 1 >>>>>>>>>>>>>>>> zadanie do zrobienia");
//            toDoList.add("nr 2 >>>>>>>>>>>>>>>>>  zadanie do zrobienia");
//            inProgressList.add("nr1 $$$$$$$$$$$$$$$   zadanie  w trakcie");
//            doneList.add("nr 1 &&&&&&&&&&&&&&&&&&   zadanie wykonane");

            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);


            System.out.println("***BEAN TODO***  ");
            System.out.println(context.containsBean("toDo"));

            Board board1 = context.getBean(Board.class);
            board1.getToDoList();


            System.out.println("  test3!!!!!!!!!!!!!!!context.getBean(Board.class)");

            System.out.println(board1.getToDoList());
            System.out.println(board1);
        }
    }


