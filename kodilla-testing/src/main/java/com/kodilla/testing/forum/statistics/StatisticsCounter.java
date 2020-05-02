package com.kodilla.testing.forum.statistics;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StatisticsCounter{

        private double avePostsPerUser;
        private double aveCommentsPerUser;
        private double aveCommentsPerPost;

    public int getUserNames(Statistics statistics) {
        return statistics.userName().size();       }
    public int getPostsCount(Statistics statistics) {
            return statistics.postCount();          }
    public int getCommentsCount(Statistics statistics) {
            return statistics.commentsCount();         }

    public void calculateAdvStatistics(Statistics statistics) {
      if(getUserNames(statistics) != 0  )
      {avePostsPerUser = getPostsCount(statistics)/getUserNames(statistics);}
      else {avePostsPerUser =0;}
      if (getUserNames(statistics) != 0 )
      {aveCommentsPerUser = getCommentsCount(statistics) /getUserNames(statistics);}
      else  { aveCommentsPerUser =0;}
      if (getPostsCount(statistics) != 0)
      {aveCommentsPerPost = getCommentsCount(statistics)/getPostsCount(statistics);}
      else  {aveCommentsPerPost =0;}
     }
    public double getAvePostsPerUser() {
        return avePostsPerUser;
    }
    public double getAveCommentsPerUser() {
        return aveCommentsPerUser;
    }
    public double getAveCommentsPerPost() {
        return aveCommentsPerPost;
    }
}

