package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("1) Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("3) Test Case: end");
    }

    @Test
    public void emptyList() {
        ArrayList<Integer> pusta = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> trening = oddNumbersExterminator.exterminate(pusta);
        Assert.assertEquals(0,trening.size());
        System.out.println("2) Empty ArrayList testing:  "+trening.size());
    }
    @Test
    public void NormalList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(14);
        numbers.add(16);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> trening = oddNumbersExterminator.exterminate(numbers);
        Assert.assertEquals(2,trening.size());
        System.out.println("2) Normal ArrayList testing:  "+trening.size());
    }
}