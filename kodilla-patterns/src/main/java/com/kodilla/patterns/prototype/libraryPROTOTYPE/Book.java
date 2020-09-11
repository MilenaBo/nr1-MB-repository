package com.kodilla.patterns.prototype.libraryPROTOTYPE;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate publicationDate;
    final Book book;

    public Book(final String title, final String author, final LocalDate publicationDate, Book book) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.book = book;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Book getBook() {return book;}

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +  '}';
    }
}
