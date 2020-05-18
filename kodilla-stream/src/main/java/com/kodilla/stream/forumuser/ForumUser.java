package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
   private final int id;
    private final String name;
    private final char sex;
    private final int dateOfBirth;
    private final int posts;

    public ForumUser(final int id, final String name, final char sex, final int dateOfBirth, final int posts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", yearOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
