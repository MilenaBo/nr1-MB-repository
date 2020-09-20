package com.kodilla.modul3.kolekcjePomiary35;

import java.util.HashMap;

public class BookHashMapSpeed {
    public static void bookHashMapSpeed() {

        //Creating collection with 800 elements of type Integer
        //String numberOfBook;
        HashMap<String,Book> list = new HashMap<String, Book>();
       String numberOfBook;
        for(int n = 0; n < 800; n++) {
            numberOfBook = String.valueOf(n)+"key";
            Book book = new Book(String.valueOf(n)+"AUTHOR",String.valueOf(n)+"TITLE");
            list.put(numberOfBook,book);
        }

        //Displaying quantity of elements
        System.out.println("*  Quantity of BOOKS in the ***HashMap*** collection: " + list.size());

        //Adding element at the end of the collection
        long begin = System.nanoTime();
        Book bookAtTheEnd = new Book(String.valueOf(list.size())+"AUTHOR",String.valueOf(list.size())+"TITLE");
        list.put(String.valueOf(list.size()),bookAtTheEnd);
        long end = System.nanoTime();

        //Displaying time of the operation
        System.out.println("*  Adding BOOK at the end of the ***HashMap*** collection has taken: " + (end - begin) + "ns");

        //Adding element at the beginning of the collection
        begin = System.nanoTime();
        Book bookAtTheBegining = new Book(String.valueOf(list.size())+"AUTHOR",String.valueOf(list.size())+"TITLE");
        list.put("0key", bookAtTheBegining);
        end = System.nanoTime();

        //Displaying time of the operation
        System.out.println("*  Adding BOOK at the beginning of the ***HashMap*** collection has taken: " + (end - begin) + "ns");

        long beginR = System.nanoTime();
        list.remove(list.size()-1);
        long endR = System.nanoTime();

        //Displaying time of deletion
        System.out.println("*** Removing last element of the ***HashMap*** collection  has taken: " + (endR - beginR) + "ns");

        //Deleting first element from collection
        beginR = System.nanoTime();
        list.remove("0key");
        endR = System.nanoTime();

        //Displaying time of deletion
        System.out.println("*** Removing first element of the ***HashMap*** collection  has taken: " + (endR - beginR) + "ns");
    }
}
