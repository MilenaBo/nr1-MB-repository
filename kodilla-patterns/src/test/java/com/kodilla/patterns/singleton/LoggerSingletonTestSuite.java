package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerSingletonTestSuite {
    private static LoggerSingleton logger;

    @BeforeClass
    public static void openlog() {
        LoggerSingleton.getInstance().log("*****   operacja nr 1   *****");
    }

    @Test
    public void testGetLastLog() {
        //given
        //when
        String logName = LoggerSingleton.getInstance().getLastLog();
        System.out.println("***   Singleton >> zapisywanie loga:   "+logName);
        //then
        Assert.assertEquals("*****   operacja nr 1   *****",logName);

    }

}




