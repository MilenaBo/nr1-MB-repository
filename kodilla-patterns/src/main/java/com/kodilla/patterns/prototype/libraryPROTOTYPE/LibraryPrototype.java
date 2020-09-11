package com.kodilla.patterns.prototype.libraryPROTOTYPE;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.library.Book;

import java.util.HashSet;
import java.util.Set;

public final class LibraryPrototype extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();
//    private LibraryPrototype libraryPrototype;
//    private Book book;

    public LibraryPrototype(String name) { this.name = name;   }
    public void setName(String name) { this.name = name;}

    public String    getName() {  return name;  }
    public Set<Book> getLists() { return books; }
    public Set<Book> getBooks() { return books; }

    @Override
    public String toString() {
        String s = "Library name=" + name + "[\n";
        for(Book book : books) { s= s + book.toString() + "\n";    }
        return s;  }

   public  LibraryPrototype shallowCopy()      throws
   CloneNotSupportedException {
        return (LibraryPrototype)super.clone();  }

//   public LibraryPrototype deepCopy() throws
//   CloneNotSupportedException {
//        LibraryPrototype clonedLibrary = (LibraryPrototype)super.clone();
//        clonedLibrary.books = new HashSet<>();
//
//        for (Book theList : books) {
//            Book clonedList = new Book(theList.getTitle(),theList.getAuthor(),theList.getPublicationDate());
//        for (Book book : theList.getTitle(),theList.getAuthor(),theList.getPublicationDate()) {
//            clonedList.getBooks().add(books);  }
//        clonedLibrary.getLists().add(clonedList);}
//        return clonedLibrary;
//   }

}
