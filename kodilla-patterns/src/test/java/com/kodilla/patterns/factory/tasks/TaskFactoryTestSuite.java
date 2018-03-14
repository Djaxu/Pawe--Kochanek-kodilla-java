package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPINGTASK);
        shopping.executeTask();
        //
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Eggs",shopping.getWhatTo());

    }
    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        //
        Assert.assertTrue(painting.isTaskExecuted());

    }
    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //
        Assert.assertTrue(driving.isTaskExecuted());

    }
}
