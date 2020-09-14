package com.kodilla.modul3.kolekcjePomiary35;

import java.util.ArrayList;


public class ArraySpeedTest {

    public static void arraySpeedTest() {
        //Creating collection with 30000 elements of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n = 0; n < 30000; n++) {
            list.add(n);
        }

        //Displaying quantity of elements
        System.out.println("*****Quantity of elements in the collection: " + list.size());

        //Deleting last element from the collection
        long begin = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();

        //Displaying time of the delete operation
        System.out.println("*****Removing last element has taken: " + (end - begin) + "ms");
    }
}

