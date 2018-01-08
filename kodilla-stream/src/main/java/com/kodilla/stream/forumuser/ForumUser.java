package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(int userId, String userName, char userSex, LocalDate birthDate, int nuberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.numberOfPosts = nuberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNuberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", nuberOfPosts=" + numberOfPosts +
                '}';
    }
}
