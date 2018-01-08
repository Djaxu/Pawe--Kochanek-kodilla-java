package com.kodilla.stream;



import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(user -> user.getBirthDate().isBefore(LocalDate.ofYearDay(1999,59)) )
                .filter(user -> user.getNuberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));


        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry-> entry.getKey()+": " + entry.getValue())
                .forEach(System.out::println);



    }
}

