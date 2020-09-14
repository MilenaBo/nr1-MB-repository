package com.kodilla.modul3.kolekcjePomiary35;

import java.util.Objects;

public class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

//    public int hashCode() {
//        char inicjal1 = 'A';
//        char inicjal2 = 'B';
//        if ( getAuthor().charAt(0) == inicjal1) {
//            return 1;}
//        if ( getAuthor().charAt(0) == inicjal2) {
//            return 2;}
//        else
//                return 3;
//        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return author.equals(book.author) &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
