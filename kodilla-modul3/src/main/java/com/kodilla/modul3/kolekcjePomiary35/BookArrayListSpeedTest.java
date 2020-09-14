package com.kodilla.modul3.kolekcjePomiary35;

import java.util.ArrayList;

public class BookArrayListSpeedTest {
    public static void bookArrayListSpeedTest() {

        //Creating collection with 8000000 elements of type Integer
        ArrayList<Book> list = new ArrayList<Book>();
        for(int n = 0; n < 800; n++) {
Book book = new Book(String.valueOf(n)+"AUTHOR",String.valueOf(n)+"TITLE");
           list.add(book);
        }

        //Displaying quantity of elements
        System.out.println("*  Quantity of BOOKS in the ArrayList collection: " + list.size());

        //Adding element at the end of the collection
        long begin = System.nanoTime();
        Book bookAtTheEnd = new Book(String.valueOf(list.size())+"AUTHOR",String.valueOf(list.size())+"TITLE");
        list.add(bookAtTheEnd);
        long end = System.nanoTime();

        //Displaying time of the operation
        System.out.println("*  Adding BOOK at the end of the ArrayList collection has taken: " + (end - begin) + "ns");

        //Adding element at the beginning of the collection
        begin = System.nanoTime();
        Book bookAtTheBegining = new Book(String.valueOf(list.size())+"AUTHOR",String.valueOf(list.size())+"TITLE");
        list.add(0, bookAtTheBegining);
        end = System.nanoTime();

        //Displaying time of the operation
        System.out.println("*  Adding BOOK at the beginning of the ArrayList collection has taken: " + (end - begin) + "ns");
    }
}


