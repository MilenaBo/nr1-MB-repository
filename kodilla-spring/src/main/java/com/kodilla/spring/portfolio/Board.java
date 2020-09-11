package com.kodilla.spring.portfolio;

public class Board {
    private String name;
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(String name) {this.name = name;}

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}

