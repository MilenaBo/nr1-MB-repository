package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final List<String> tasks;

    public TaskList() {
        tasks=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "TaskList.......{" +
                "tasks=" + tasks +
                '}';
    }

}