package com.kodilla.spring.libraryKONSTRUKTOR;
import org.springframework.stereotype.Repository;

@Repository
public class Library1DbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}
