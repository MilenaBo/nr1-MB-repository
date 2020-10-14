package com.kodilla.patterns22.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //when
        javaHelpForum.addPost("Hi everyone");
        javaHelpForum.addPost("Hi");
        javaToolsForum.addPost("Help pls");
        javaHelpForum.addPost("Why while?");
        javaToolsForum.addPost("Mysql doesn't want to work");
        //then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiePinkman.getUpdateCount());
    }
}
