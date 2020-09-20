package com.kodilla.patterns.prototype.libraryPROTOTYPE;

import com.kodilla.patterns.prototype.library.Book;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryPrototypeTestSuite {
    @Test
    public void testGetBooks() {

        //given
        LibraryPrototype libraryENG = new LibraryPrototype("LITERATURA ANGIELSKA");
        Set<Book> books = new HashSet<>();
        Book bookEng1 = new Book("title1", "author1", LocalDate.of(2011, 6, 2));
        Book bookEng2 = new Book("title2", "author2", LocalDate.of(2012, 6, 2));
        books.add(bookEng1);
        books.add(bookEng2);
        System.out.println("ENGlibraryENG  "+libraryENG+books);
        LibraryPrototype libraryPl = new LibraryPrototype("LITERATURA POLSKA");
        Book bookPl1 = new Book("PLtitle3", "PLauthor1", LocalDate.of(2013, 6, 2));
        Book bookPl2 = new Book("PLtitle4", "PLauthor2", LocalDate.of(2014, 6, 2));
        Book bookPl3 = new Book("PLtitle5", "PLauthor3", LocalDate.of(2015, 6, 2));
        books.add(bookPl1);
        books.add(bookPl2);
        books.add(bookPl3);
        System.out.println("PLlibraryPllllllllll   "+libraryPl+books);
        System.out.println("wszystko///////////"+books);


//
//shallow copy
        LibraryPrototype cloneLibrary = null;
        try {
            cloneLibrary = libraryENG.shallowCopy();
            cloneLibrary.setName("LITERATURA POLSKA");
        } catch (CloneNotSupportedException e) {
            System.out.println("eeeeeeee  "+e);        }
        cloneLibrary.getBooks();
        cloneLibrary.getLists();

        cloneLibrary.getName();

        System.out.println("test nr1,,,shallow copy  "+cloneLibrary.getLists());
        System.out.println("test nr1,,,library...getBooks  "+libraryENG.getBooks());
        //when     //then
        Assert.assertEquals(5, books.size());
       // Assert.assertEquals(5, cloneLibrary.getLists().size());
        //Assert.assertEquals(cloneLibrary.getBooks(), books);
        //deep copy
//        LibraryPrototype deepClonedLibrary = null;
//        try {
//            deepClonedLibrary = library.deepCopy();
//            deepClonedLibrary.setName("LITERATURA POLSKA");
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e);
//            System.out.println("NR2222222222222222"+library.getBooks());
//            System.out.println("NR22222222222222222"+cloneLibrary.getBooks());
//            System.out.println("deep"+deepClonedLibrary.getBooks());
//        }
    }}

//deep copy
//        LibraryPrototype deepClonedLibrary = null;
//        try {
//            deepClonedLibrary = library.deepCopy();
//            deepClonedLibrary.setName("LITERATURA POLSKA");
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e);
//            System.out.println("NR2222222222222222"+library.getBooks());
//          //  System.out.println("NR22222222222222222"+cloneLibrary.getBooks());
//            System.out.println("deep"+deepClonedLibrary.getBooks());
//        }