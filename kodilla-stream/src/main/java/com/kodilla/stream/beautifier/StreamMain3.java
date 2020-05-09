package com.kodilla.stream.beautifier;

public class StreamMain3 {
    public static void  main(String[] arg) {
        System.out.println("moduł7 zadanie 1");

        PoemBeatifier poemBeatifier = new PoemBeatifier();

        poemBeatifier.beatify("zwykły tekst",text -> "ABC "+text+" ABC");
        poemBeatifier.beatify("zwykły tekst",text -> "***  "+text+"  ***");
        poemBeatifier.beatify("zwykły tekst",text -> text.toUpperCase());
        poemBeatifier.beatify("zwykły tekst",text -> text.toLowerCase());
    }
}
