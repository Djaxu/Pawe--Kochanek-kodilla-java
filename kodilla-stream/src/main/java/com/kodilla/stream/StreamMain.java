/*package com.kodilla.stream;



        import com.kodilla.stream.forumuser.Forum;
        import com.kodilla.stream.forumuser.ForumUser;


        import java.time.LocalDate;
        import java.time.temporal.ChronoUnit;
        import java.util.Map;
        import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {


        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(user -> ChronoUnit.YEARS.between(user.getBirthDate(),LocalDate.now())>20)
                .filter(user -> user.getUserSex()=='M' )
                .filter(user -> user.getNuberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));


        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry-> entry.getKey()+": " + entry.getValue())
                .forEach(System.out::println);



    }
}
*/
package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Teskt do Ozdobienia",(a)-> a.toUpperCase());
        poemBeautifier.beautify("TEKST do Ozdobienia nr 2",(a)-> a.toLowerCase());
        poemBeautifier.beautify("Teskt do Ozdobienia nr 3",(a)-> "ABC "+a +" ABC");
        poemBeautifier.beautify("Teskt do Ozdobienia nr 4",(a)-> "***"+a.toUpperCase()+"***");

    }
}
