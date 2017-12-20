package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testUsersZero() {
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        when(mockStatistics.usersNames()).thenReturn(new ArrayList<>());
        //When

        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then

        Assert.assertEquals(0, statisticsCheck.getCountOfUsers());

    }

    @Test
    public void testUsersHundred() {
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        ArrayList postList = new ArrayList();
        for (int n = 0; n < 100; n++) {
            postList.add(1);
        }

        when(mockStatistics.usersNames()).thenReturn(postList);
        //When
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(100, statisticsCheck.getCountOfUsers());
    }

    @Test
    public void testPostZero() {
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer postCount = 0;
        when(mockStatistics.postsCount()).thenReturn(postCount);
        //Wehn
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0, statisticsCheck.getPosts());
    }

    @Test
    public void testPost1k() {
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer postCount = 1000;
        when(mockStatistics.postsCount()).thenReturn(postCount);
        //Wehn
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(1000, statisticsCheck.getPosts());
    }
    @Test
    public void testCommentsZero() {
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer commentsCount = 0;
        when(mockStatistics.commentsCount()).thenReturn(commentsCount);
        //Wehn
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0, statisticsCheck.getComments());
    }
    @Test
    public void testMoreCommentsThenPosts(){
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer commentsCount = 50;
        Integer postsCount = 10;
        when(mockStatistics.commentsCount()).thenReturn(commentsCount);
        when(mockStatistics.postsCount()).thenReturn(postsCount);
        //When
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(5,statisticsCheck.getCommentsAveragePerPost());

    }

    @Test
    public void testMorePostsThenComments(){
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer commentsCount = 5;
        Integer postsCount = 100;
        when(mockStatistics.commentsCount()).thenReturn(commentsCount);
        when(mockStatistics.postsCount()).thenReturn(postsCount);
        //When
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0,statisticsCheck.getCommentsAveragePerPost());

    }
    @Test
    public void testMoreCommentsThenUsers(){
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer commentsCount = 50;
        ArrayList userList = new ArrayList();
        userList.add("Pawel");
        when(mockStatistics.usersNames()).thenReturn(userList);
        when(mockStatistics.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(50, statisticsCheck.getCommentsAveragePerUser());

    }
    @Test
    public void test(){
        //Given
        Statistics mockStatistics = mock(Statistics.class);
        StatisticsCheck statisticsCheck = new StatisticsCheck();
        Integer postCount = 20;
        ArrayList userList = new ArrayList();
        for (int n = 0; n < 10; n++) {
            userList.add(1);
        }
        when(mockStatistics.postsCount()).thenReturn(postCount);
        when(mockStatistics.usersNames()).thenReturn(userList);
        //When
        statisticsCheck.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(2, statisticsCheck.getPostsAveragePerUser());

    }
}
