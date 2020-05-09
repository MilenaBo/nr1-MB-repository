package com.kodilla.stream.beautifier;

public class PoemBeatifier {

    public void beatify(String text, PoemDecorator decor) {
        String result = decor.decorate(text);
        System.out.println(result);
    }
}
