package com.kodilla.patterns.prototype.libraryPROTOTYPE;

import com.kodilla.patterns.prototype.library.Book;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryPrototypeTestSuite {
    @Test
    public void testGetBooks() {
        //given
        LibraryPrototype library = new LibraryPrototype("LITERATURA ANGLOJEZYCZNA");
        Book bookEng1 = new com.kodilla.patterns.prototype.library.Book("title1","author1", LocalDate.of(2011, 6, 2));
        Book bookEng2 = new Book("title2","author2", LocalDate.of(2012, 6, 2));
        library.getBooks().add(bookEng1);
        library.getBooks().add(bookEng2);

        System.out.println(library);

        LibraryPrototype libraryPl = new LibraryPrototype("LITERATURA POLSKA");
        Book bookPl1 = new Book("title1","author1", LocalDate.of(2011, 6, 2));
        Book bookPl2 = new Book("title2","author2", LocalDate.of(2012, 6, 2));
        Book bookPl3 = new Book("title3","author3", LocalDate.of(2013, 6, 2));
        libraryPl.getBooks().add(bookPl1);
        libraryPl.getBooks().add(bookPl2);
        libraryPl.getBooks().add(bookPl3);

        System.out.println(libraryPl);

//shallow copy
        LibraryPrototype cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("LITERATURA POLSKA");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        //then
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,cloneLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(),library.getBooks());
        }
}
