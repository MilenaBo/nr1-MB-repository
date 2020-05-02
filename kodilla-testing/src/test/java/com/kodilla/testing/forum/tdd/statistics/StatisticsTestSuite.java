package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.*;

import java.util.*;
import java.lang.*;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private Object ArrayList;

    @Test // 0 users
    public void U0TestCalculateAdvStatistics() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.userName()).thenReturn(new ArrayList<>());

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //when
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // then
        Assert.assertEquals(0,statisticsCounter.getAveCommentsPerPost(),0.01);
        Assert.assertEquals(0,statisticsCounter.getAveCommentsPerUser(),0.01);
        Assert.assertEquals(0,statisticsCounter.getAvePostsPerUser(),0.01);
    }

 @Test  // 100 users, 100 posts, 0comments
 public void U100p100c0TestCalculateAdvStatistics() {
     Statistics statisticsMock = mock(Statistics.class);

     List<String> userNames = new ArrayList<>();
     String s="U";
     for (int n =0; n<100; n++) {userNames.add(s); s=s+"u";};
     
     when(statisticsMock.postCount()).thenReturn(100);
     when(statisticsMock.commentsCount()).thenReturn(0);
     when(statisticsMock.userName()).thenReturn(userNames);

     StatisticsCounter statisticsCounter = new StatisticsCounter();

     //when
     statisticsCounter.calculateAdvStatistics(statisticsMock);
     // then
     Assert.assertEquals(0,statisticsCounter.getAveCommentsPerPost(),0.01);
     Assert.assertEquals(0,statisticsCounter.getAveCommentsPerUser(),0.01);
     Assert.assertEquals(1,statisticsCounter.getAvePostsPerUser(),0.01);
 }
    @Test   //  100 users, 1000 posts, 2000 comments
    public void U100p1000c100testCalculateAdvStatistics() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        String s="U";
        for (int n =0; n<100; n++) {userNames.add(s); s=s+"u";};

        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.userName()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //when
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // then
        Assert.assertEquals(2,statisticsCounter.getAveCommentsPerPost(),0.01);
        Assert.assertEquals(20,statisticsCounter.getAveCommentsPerUser(),0.01);
        Assert.assertEquals(10,statisticsCounter.getAvePostsPerUser(),0.01);
    }
    @Test   //  100 users, 1000 posts, 50 comments
    public void U100p1000c50testCalculateAdvStatistics() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        String s="U";
        for (int n =0; n<100; n++) {userNames.add(s); s=s+"u";};

        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.userName()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //when
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // then
      //  Assert.assertEquals(0.05,statisticsCounter.getAveCommentsPerPost(),0.001);
        Assert.assertEquals(0.5,statisticsCounter.getAveCommentsPerUser(),0.001);
        Assert.assertEquals(10,statisticsCounter.getAvePostsPerUser(),0.001);
    }



}
