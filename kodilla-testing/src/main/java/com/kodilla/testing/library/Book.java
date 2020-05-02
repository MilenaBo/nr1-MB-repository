package com.kodilla.testing.library;

public class Book {
    String title;
    String author;
    int publicatinYear;

   public Book(String title, String author, int publicatinYear) {
       this.title = title;
       this.author = author;
       this.publicatinYear = publicatinYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicatinYear() {
        return publicatinYear;
    }
    @Override
    public String toString() {
       return  "Book{" + title+", author="+author+",, publicationYear=" + publicatinYear +"}";
           }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (!(o instanceof Book)) return false;
       Book book = (Book) o;
       if (publicatinYear != book.publicatinYear) return false;
       if (!title.equals(book.title)) return false;
       return author.equals(book.author);
    }

    @Override
    public int hashCode() {
       int result = title.hashCode();
       result = 31 * result + author.hashCode();
       result = 31 * result + publicatinYear;
        return result;
    }
}
