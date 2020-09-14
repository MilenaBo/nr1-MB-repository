package com.kodilla.modul3.kolekcjePomiary35;
import java.util.ArrayList;

public class ArraySpeedTestRemove0 {

public static void arraySpeedTestRemove0() {
    //Creating collection with 8000000 elements of type Integer
    ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n = 0; n < 8000000; n++) {
        list.add(n);
    }

    //Displaying quantity of elements
		System.out.println("*** Quantity of elements in the collection: " + list.size());

    //Deleting last element in the collection
    long begin = System.currentTimeMillis();
		list.remove(list.size()-1);
    long end = System.currentTimeMillis();

    //Displaying time of deletion
		System.out.println("*** Removing last element has taken: " + (end - begin) + "ms");

    //Deleting first element from collection
    begin = System.currentTimeMillis();
		list.remove(0);
    end = System.currentTimeMillis();

    //Displaying time of deletion
		System.out.println("*** Removing first element has taken: " + (end - begin) + "ms");
}
}
