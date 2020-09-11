package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    String  name;
    private final List<String> tasks = new ArrayList<>();
    private Board board;

    public TaskList(final  String name) {
        this.name = name;
    }
    public String getName() {  return name;  }

    public TaskList(final Board board) {
        this.board=board;
        }

        public  TaskList() {}

        public void toDoX() {
        board.getToDoList();
        }
        public void inProgressX() {
        board.getInProgressList();
        }
        public void doneX() {
        board.getDoneList();
        }

}
