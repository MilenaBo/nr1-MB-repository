package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given

        Set<Book> booksEng = new HashSet<>();
        Book bookEng1 = new Book("title1","author1", LocalDate.of(2011, 6, 2));
        Book bookEng2 = new Book("title2","author2", LocalDate.of(2012, 6, 2));
       booksEng.add(bookEng1);
       booksEng.add(bookEng2);

        Set<Book> booksPol = new HashSet<>();
        Book bookPol1 = new Book("POL   title1","author1", LocalDate.of(2011, 6, 2));
        Book bookPol2 = new Book("POL   title2","author2", LocalDate.of(2012, 6, 2));
        Book bookPol3 = new Book("POL   title3","author3", LocalDate.of(2012, 6, 2));
        booksPol.add(bookPol1);
        booksPol.add(bookPol2);
        booksPol.add(bookPol3);

        Library library = new Library("literatura dział 1    ");
        library.getBooks().add(bookEng1);
        library.getBooks().add(bookEng2);
        library.getBooks().add(bookPol1);
        library.getBooks().add(bookPol2);
        library.getBooks().add(bookPol3);

    System.out.println(library);

        //when
        //then
        Assert.assertEquals(5,library.getBooks().size());
    }
}
