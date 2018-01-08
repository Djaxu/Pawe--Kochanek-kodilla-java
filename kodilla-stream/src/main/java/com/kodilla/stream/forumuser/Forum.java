package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum(){
        theForumList.add(new ForumUser(1,"User1",'M',LocalDate.ofYearDay(1989,8),5));
        theForumList.add(new ForumUser(2,"User2",'F',LocalDate.ofYearDay(1999,28),3));
        theForumList.add(new ForumUser(3,"User3",'M',LocalDate.ofYearDay(1979,13),4));
        theForumList.add(new ForumUser(4,"User4",'F',LocalDate.ofYearDay(1999,2),0));
        theForumList.add(new ForumUser(5,"User5",'M',LocalDate.ofYearDay(2005,1),5));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumList);
    }
}
