package com.kodilla.good.patterns.challenges;

public final class Title {
    private final String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  title + '*';
    }
}
