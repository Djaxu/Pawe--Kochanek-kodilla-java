package com.kodilla.testing.forum.statistics;

public class StatisticsCheck {

    private int countOfUsers;
    private int posts;
    private int comments;
    private int postsAveragePerUser=0;
    private int commentsAveragePerUser=0;
    private int commentsAveragePerPost=0;

    public void calculateAdvStatistics(Statistics statistics){
        this.countOfUsers=statistics.usersNames().size();
        this.posts=statistics.postsCount();
        this.comments=statistics.commentsCount();
        if(countOfUsers>0){
            this.postsAveragePerUser= posts / countOfUsers;
            this.commentsAveragePerUser= comments / countOfUsers;
        }
        if(comments>0){
            this.commentsAveragePerPost = comments/ posts;
        }


    }

    public int getCountOfUsers() {
        return countOfUsers;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public int getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public int getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public int getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }
}
