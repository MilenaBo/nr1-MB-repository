package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        AllTitlesLists allTitlesLists = (AllTitlesLists) MovieStore.getMovies();

//        String theResultStringOfTitles = allTitlesLists.getAllTitlesListsMap().stream()
//                .flatmap(titleList -> allTitlesLists.getTitleList().stream())
//                .map(Title::getTitle)
//                .collect(Collectors.joining("!","<<",">>"));
//        System.out.println(theResultStringOfTitles);

    }
}
