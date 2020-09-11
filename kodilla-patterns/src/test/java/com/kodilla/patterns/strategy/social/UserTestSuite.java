package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new ZGeneration("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new Millenials("Kodilla");

        //When
        String stevenShouldPublish = steven.publisher();
        System.out.println("Steven should: " + stevenShouldPublish);
        String johnShouldPublish = john.publisher();
        System.out.println("John should: " + johnShouldPublish);
        String kodillaShouldPublish = kodilla.publisher();
        System.out.println("Kodilla should: " + kodillaShouldPublish);

        //Then
        Assert.assertEquals(" **SnapchatPublisher** ", stevenShouldPublish);
        Assert.assertEquals("**TwitterPublisher**", johnShouldPublish);
        Assert.assertEquals(" **Facebook** ", kodillaShouldPublish);
    }

    @Test
    public void testIndividualPublishStrategy() {
        //Given
        User steven = new ZGeneration("Steven Links");

        //When
        String stevenShouldPublish = steven.publisher();
        System.out.println("Steven should: " + stevenShouldPublish);
        steven.setPublisherStrategy(new FacebookPublisher());
        stevenShouldPublish = steven.publisher();
        System.out.println("Steven now should: " + stevenShouldPublish);

        //Then
        Assert.assertEquals(" **Facebook** ", stevenShouldPublish);
    }
}