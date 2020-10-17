package com.kodilla.patterns22.adapter.bookclassifier;

import com.kodilla.patterns22.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns22.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //given
        Book theBook1  = new Book("B. Prus","Faraon",1897,"PL1000");
        Book theBook2  = new Book("B. Prus","Lalka",1890,"PL1000");
        Book theBook3  = new Book("B. Prus","Placówka",1986,"PL1000");
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(theBook1);
        bookSet.add(theBook2);
        bookSet.add(theBook3);
        //when
        MedianAdapter medianAdapter = new MedianAdapter();
        double median = medianAdapter.publicationYearMedian(bookSet);
        //then
        System.out.println(median);
        Assert.assertEquals(median,1897,0.1);
    }
}
