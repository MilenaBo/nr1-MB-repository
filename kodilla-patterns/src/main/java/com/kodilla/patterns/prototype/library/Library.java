package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.libraryPROTOTYPE.LibraryPrototype;

import java.util.HashSet;
import java.util.Set;

public final class Library {
    final String name;
    final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }
    public String    getName() {
        return name;
    }
    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

}