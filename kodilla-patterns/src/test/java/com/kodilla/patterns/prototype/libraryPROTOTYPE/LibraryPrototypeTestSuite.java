package com.kodilla.patterns.prototype.libraryPROTOTYPE;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryPrototypeTestSuite {
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

        LibraryPrototype library = new LibraryPrototype("literatura PROJEKT 1    ");
        library.getBooks().add(bookEng1);
        library.getBooks().add(bookEng2);
        library.getBooks().add(bookPol1);
        library.getBooks().add(bookPol2);
        library.getBooks().add(bookPol3);
        System.out.println(library);

//shallow copy
        LibraryPrototype clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("literatura PROJEKT 22222   ");
        } catch (CloneNotSupportedException e) {
            System.out.println("eeeeeeee  "+e);        }
        clonedLibrary.getBooks();
        clonedLibrary.getLists();
        clonedLibrary.getName();
//deep copy
        LibraryPrototype deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("LITERATURA PROJEKT  333333333");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //when
        library.getLists().remove(bookPol3);
        // then
        System.out.println("test ,,,shallow copy  "+clonedLibrary);
        System.out.println("test ,,,shallow copy  library.getBooks  "+library.getBooks());
        System.out.println("test ,,,DEEP copy  "+deepClonedLibrary);
        System.out.println("NR   33333  library.getBooks   ::::"+library.getBooks());
        System.out.println("NR  333333333333   deepClonedLibrary.getLists   :::"+deepClonedLibrary.getLists());
        System.out.println("deep"+deepClonedLibrary.getBooks());

        Assert.assertEquals(4, library.getLists().size());
        Assert.assertEquals(4, clonedLibrary.getLists().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertEquals(5,deepClonedLibrary.getLists().size());
    }
}

