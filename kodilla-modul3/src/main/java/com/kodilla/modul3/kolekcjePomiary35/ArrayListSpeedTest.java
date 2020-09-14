package com.kodilla.modul3.kolekcjePomiary35;

import java.util.ArrayList;

public class ArrayListSpeedTest {

    public static void arrayListSpeedTest() {
    //Creating collection with 8000000 elements of type Integer
    ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n = 0; n < 8000000; n++) {
        list.add(n);
    }

    //Displaying quantity of elements
		System.out.println("*  Quantity of elements in the ArrayList collection: " + list.size());

    //Adding element at the end of the collection
    long begin = System.nanoTime();
		list.add(list.size());
    long end = System.nanoTime();

    //Displaying time of the operation
		System.out.println("*  Adding element at the end of the ArrayList collection has taken: " + (end - begin) + "ns");

    //Adding element at the beginning of the collection
    begin = System.nanoTime();
		list.add(0, list.size());
    end = System.nanoTime();

    //Displaying time of the operation
		System.out.println("*  Adding element at the beginning of the ArrayList collection has taken: " + (end - begin) + "ns");
}
}

