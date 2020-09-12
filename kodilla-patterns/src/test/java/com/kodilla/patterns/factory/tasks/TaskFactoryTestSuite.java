package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //then
        Assert.assertEquals("zakupy w Biedronce",shopping.getTaskName());
        Assert.assertEquals("pomidory",shopping.executeTask());
        Assert.assertEquals(true,shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryPainting() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //then
        Assert.assertEquals("mieszkanie J.Kowalskiego",painting.getTaskName());
        Assert.assertEquals("bialy",painting.executeTask());
        Assert.assertEquals(false,painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDriving() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //then
        Assert.assertEquals("jazda próbna ",driving.getTaskName());
        Assert.assertEquals("Kraków",driving.executeTask());
        Assert.assertEquals(true,driving.isTaskExecuted());
    }
}
