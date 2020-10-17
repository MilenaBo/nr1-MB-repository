package com.kodilla.patterns22.adapter.bookclasifier;

import com.kodilla.patterns22.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns22.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns22.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns22.adapter.bookclasifier.libraryb.BookStatistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns22.adapter.bookclasifier.libraryb.Book> libraryBookMap = new HashMap<>();
        for (Book book : bookSet) {
            libraryBookMap.put(new BookSignature(book.getSignature()),
                    new com.kodilla.patterns22.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(libraryBookMap);
    }
}