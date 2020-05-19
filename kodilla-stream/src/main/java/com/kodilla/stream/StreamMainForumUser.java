package com.kodilla.stream;
import com.kodilla.stream.forumuser.*;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMainForumUser {

    public static void main(String[] args) {
        Forum theForum = new Forum();

        System.out.println(" mężczyźni: ");
        Map<String,ForumUser> theResultMapOfForumUser = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() != 'F')
                .collect(Collectors.toMap(ForumUser::getName, forumUser -> forumUser));

        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() +": "+entry.getValue())
                .forEach(System.out::println);

        System.out.println(" maja co najmniej 20 lat: "); // nie zastosowałam typu LocalDate
        Map<String,ForumUser> theResultMapOfForumUser2 = theForum.getList().stream()
                .filter(forumUser -> forumUser.getDateOfBirth() < 2000)
                .collect(Collectors.toMap(ForumUser::getName, forumUser -> forumUser));

        theResultMapOfForumUser2.entrySet().stream()
                .map(entry -> entry.getKey() +": "+entry.getValue())
                .forEach(System.out::println);

        System.out.println(" opublikowali jakiś post: ");
        Map<String,ForumUser> theResultMapOfForumUser3 = theForum.getList().stream()
                .filter(forumUser -> forumUser.getPosts() >0)
                .collect(Collectors.toMap(ForumUser::getName, forumUser -> forumUser));

        theResultMapOfForumUser3.entrySet().stream()
                .map(entry -> entry.getKey() +": "+entry.getValue())
                .forEach(System.out::println);
    }
}
