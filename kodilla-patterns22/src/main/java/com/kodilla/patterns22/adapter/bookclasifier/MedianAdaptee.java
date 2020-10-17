package com.kodilla.patterns22.adapter.bookclasifier;

import com.kodilla.patterns22.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns22.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns22.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns22.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublikationYear(Map<BookSignature, Book> books) {
        Statistics theStatistics = new Statistics();
        return  theStatistics.averagePublikationYear(books);
    }
    public int medianPublicationYear(Map<BookSignature, Book> books)    {
        Statistics theStatistics = new Statistics();
        return theStatistics.medianPublicationYear(books);
    }
}
