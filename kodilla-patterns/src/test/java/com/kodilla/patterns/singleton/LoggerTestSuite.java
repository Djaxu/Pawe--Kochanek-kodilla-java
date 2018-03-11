package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openSettingsFile(){
        Logger.getInstance().log("This is my log");
    }

    @Test
    public void testLogger(){
        //Given  & When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Opening latest log: " + log);
        //Then
        Assert.assertEquals("This is my log", log);
    }
}
