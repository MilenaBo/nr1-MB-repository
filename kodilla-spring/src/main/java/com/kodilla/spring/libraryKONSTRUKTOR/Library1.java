package com.kodilla.spring.libraryKONSTRUKTOR;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
    public final class Library1 {
        private final List<String> books = new ArrayList<>();
        private final Library1DbController libraryDbController;

        public Library1(final Library1DbController libraryDbController) {
            this.libraryDbController = libraryDbController;
        }

        public void saveToDb() {
            libraryDbController.saveData();
        }

        public void loadFromDb() {
            libraryDbController.loadData();
        }
    }

