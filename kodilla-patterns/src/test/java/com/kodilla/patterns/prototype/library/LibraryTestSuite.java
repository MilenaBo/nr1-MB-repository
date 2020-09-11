package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
    Library libraryEng = new Library("LITERATURA ANGLOJEZYCZNA");
    Book bookEng1 = new Book("title1","author1", LocalDate.of(2011, 6, 2));
    Book bookEng2 = new Book("title2","author2", LocalDate.of(2012, 6, 2));
    libraryEng.getBooks().add(bookEng1);
    libraryEng.getBooks().add(bookEng2);

    System.out.println(libraryEng);

        //when
        //then
        Assert.assertEquals(2,libraryEng.getBooks().size());
    }
}
