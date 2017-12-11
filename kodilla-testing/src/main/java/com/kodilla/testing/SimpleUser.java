package com.kodilla.testing.user;

public class SimpleUser {
    private String username;
    String realName;
    //constructor
    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }
    //getter
    public String getUsername() {
        return username;
    }

    public String getRealName(){
        return realName;
    }
}
