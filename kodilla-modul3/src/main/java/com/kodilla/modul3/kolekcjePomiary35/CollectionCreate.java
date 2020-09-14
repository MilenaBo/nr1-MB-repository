package com.kodilla.modul3.kolekcjePomiary35;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
public class CollectionCreate
{

    //public static void main (String[] args) throws java.lang.Exception
   public static void collectionCreate() {
        //Creating collection with 30000 elements of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n = 0; n < 30000; n++) {
            list.add(n);
        }

        //Displaying quantity of elements in the collection
        System.out.println("******** CollectionCreate. Quantity of elements in the collections: " + list.size());
    }
}