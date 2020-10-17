package com.kodilla.patterns22.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublikationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}
