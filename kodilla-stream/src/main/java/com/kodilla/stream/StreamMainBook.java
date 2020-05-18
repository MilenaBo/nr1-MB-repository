package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainBook {
        public static void main(String[] args) {
            BookDirectory theBookDirectory = new BookDirectory();
            theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .forEach(System.out::println);

            System.out.println("OPERACJA TERMINALNA Collectors.toList()");
            List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .collect(Collectors.toList());

            System.out.println("# elements: " + theResultListOfBooks.size());
            theResultListOfBooks.stream()
                    .forEach(System.out::println);

            System.out.println("OPERACJA TERMINALNA Collectors.toMap()");
            Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .collect(Collectors.toMap(Book::getSignature, book -> book));

            System.out.println("# elements: " + theResultMapOfBooks.size());
            theResultMapOfBooks.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);

            System.out.println("OPERACJA TERMINALNA Collectors.joining(String delimiter, String prefix, String suffix)");

            String theResultStringOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .map(Book::toString)
                    .collect(Collectors.joining(",\n","<<",">>"));

            System.out.println(theResultStringOfBooks);
        }
    }

