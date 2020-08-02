package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
private static Logger logger;

@BeforeClass
    public static void openlog() {
    logger = new Logger();
    logger.log("*****   operacja nr 1   *****");
}

@Test
    public void testGetLastLog() {
    //given
    //when
    String logName = logger.getLastLog();
    System.out.println("***   zapisywanie loga:   "+logName);
    //then
    Assert.assertEquals("*****   operacja nr 1   *****",logName);

}

}
