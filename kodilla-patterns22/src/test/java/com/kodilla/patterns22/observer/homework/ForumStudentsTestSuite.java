package com.kodilla.patterns22.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;
public class ForumStudentsTestSuite {
    @Test
    public void testUPdate()    {
        //given
        ForumCourse mentorAdam = new MentorAdam();
        ForumCourse mentorEwa = new MentorEwa();

        ForumStudents ania = new ForumStudents("Ania");
        ForumStudents  ela = new ForumStudents("Ela");
        ForumStudents  romek = new ForumStudents("Romek");
        ForumStudents  janek = new ForumStudents("Janek");
        ForumStudents  marek = new ForumStudents("Marek");
        ForumStudents  dawid = new ForumStudents("Dawid");

        mentorAdam.registerObserver(ania);
        mentorAdam.registerObserver(romek);
        mentorAdam.registerObserver(janek);
        mentorEwa.registerObserver(ela);
        mentorEwa.registerObserver(marek);
        mentorEwa.registerObserver(dawid);

        //when
        mentorAdam.addTask("3.4 zadanie");
        mentorAdam.addTask("3.4 zadanie");
        mentorAdam.addTask("3.4 zadanie");
        mentorAdam.addTask("4.4 zadanie");

        mentorEwa.addTask("3.4 zadanie");
        mentorEwa.addTask("5.4 zadanie");
// then
        assertEquals(4,ania.getUpdateCount());
        assertEquals(2,ela.getUpdateCount());
    }
}
