package com.kodilla.patterns22.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ForumCourse implements CourseObservable  {
    private final List<CourseObserver> observers;
    private final List<String> messages;
    private final String name;

    public ForumCourse(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task) {
        messages.add(task);
        notifyObservers();
    }
    @Override
    public void registerObserver(CourseObserver courseObserver) {
        observers.add(courseObserver);
    }
    @Override
    public void notifyObservers() {
        for (CourseObserver courseObserver : observers)     {   courseObserver.update(this);    }
    }
    @Override
    public void removeObserver(CourseObserver courseObserver) {
        observers.remove(courseObserver);
    }

    public List<String> getMessages()   {     return messages;    }
    public String getName()             {     return name;    }
}
