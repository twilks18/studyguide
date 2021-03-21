package com.studyguide;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String args[]) {
//        Question(Long id, String question, String answer)


        /**
         * The class name is Example(which is a object)
         * The new keyword is used to instantiate or create that object
         * Whenever you create a new object it must also be given a name such as q1 and
         * it must also be given a type and in this case it is a Question.
         */

        //-Here is another way to comment out code

        Question q1 = new Question(10, "What is your name", "Pamela" );
        Question q2 = new Question(11, "What month is your birthday?", "January");
        Question q3 = new Question();
        q3.setId(12);
        q3.setQuestion("What is you favorite color?");
        q3.setAnswer("Blue.");


        System.out.println("Question 1 - " + q1.getQuestion() +": "+  q1.getAnswer());
        System.out.println("Question 2 - " + q2.getQuestion() +": "+  q2.getAnswer());
        System.out.println("Question 3 - " + q3.getQuestion() +": "+  q3.getAnswer());

        List<Question> questions = new ArrayList<>();

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

        Chapter c1= new Chapter(2,questions, "Ready");

        System.out.println("chapter id:" + c1.getId());
        System.out.println("chapter name: " + c1.getName());
        System.out.println("chaptr questions: " +  c1.getQuestions().toString()     );

    }
}
