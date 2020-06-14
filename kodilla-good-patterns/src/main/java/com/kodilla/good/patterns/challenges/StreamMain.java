package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

               String theResultStringOfTitles = MovieStore.getMovies().values().stream()
                .flatMap(TitlesLists -> TitlesLists.stream())
               .collect(Collectors.joining("!","<<",">>"));

        System.out.println(theResultStringOfTitles);
    }
}
