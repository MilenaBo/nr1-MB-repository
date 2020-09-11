package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
 TaskList toDoList;
 TaskList inProgressList;
 TaskList doneList;
 //z tym działaja poprawnie testy
 Board board;

 @Bean
 public TaskList taskList() {
  return new TaskList(board);
 }

 @Autowired
 @Qualifier("toDo")

 @Bean(name = "todo")
 @Scope("prototype")
 public TaskList getTaskList1() {
  return board.getToDoList();
 }

 @Bean(name = "inProgress")
 @Scope("prototype")
 public TaskList getTaskList2() {
  return board.getInProgressList();
 }

 @Bean(name = "Done")
 @Scope("prototype")
 public TaskList getTaskList3() {
  return board.getDoneList();
 }

@Bean
 public Board getBoard() { return new Board(toDoList,inProgressList,doneList); }

 }
