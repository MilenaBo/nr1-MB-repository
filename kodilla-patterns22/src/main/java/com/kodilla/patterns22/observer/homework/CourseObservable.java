package com.kodilla.patterns22.observer.homework;

public interface CourseObservable {
    void registerObserver(CourseObserver courseObserver);
    void notifyObservers();
    void removeObserver(CourseObserver courseObserver);
}
