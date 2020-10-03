package com.kodilla.patterns.prototype.libraryPROTOTYPE;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.library.Book;

import java.util.HashSet;
import java.util.Set;

public final class LibraryPrototype extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

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

   public LibraryPrototype deepCopy() throws
   CloneNotSupportedException {
        LibraryPrototype clonedLibrary = (LibraryPrototype)super.clone();
        clonedLibrary.books = new HashSet<>();
        Set<Book> clonedSet = new HashSet<>();
        for (Book theList : books) {
            Book clonedBook = new Book(theList.getTitle(), theList.getAuthor(), theList.getPublicationDate());
            clonedSet.add(clonedBook);
        }
        clonedLibrary.books = clonedSet;
        return clonedLibrary;
   }

}
