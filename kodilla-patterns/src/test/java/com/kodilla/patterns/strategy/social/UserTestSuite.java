package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenials = new Millenials("Milenials");
        User yGeneration = new YGeneration("YGeneration");
        User zGeneration = new ZGeneration("ZGenration");

        //When
        String millenialsShare = millenials.publish();
        System.out.println("Millenials Should publish on : " + millenialsShare);
        String yGenerationShare = yGeneration.publish();
        System.out.println("YGeneration Should publish on : " + yGenerationShare);
        String zGenerationShare = zGeneration.publish();
        System.out.println("ZGeneration Should publish on : " + zGenerationShare);

        //Then
        Assert.assertEquals("Facebook", millenialsShare);
        Assert.assertEquals("Twitter", yGenerationShare);
        Assert.assertEquals("Snapchat", zGenerationShare);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenials = new Millenials("Milenmials");

        //When
        String millenialsShare = millenials.publish();
        System.out.println("Millenials Should publish on : " + millenialsShare);
        millenials.setSocialPublisher(new TwitterPublisher());
        millenialsShare = millenials.publish();
        System.out.println("This Time Millenials Should publish on : " + millenialsShare);

        //Then
        Assert.assertEquals("Twitter", millenialsShare);


    }
}
