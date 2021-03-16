package com.studyguide;

public class Example {

    public static void main(String args[]) {
//        Question(Long id, String question, String answer)

        Question q1 = new Question(10, "What is your name", "Pamela" );
        Question q2 = new Question(11, "What month is your birthday?", "January");
        Question q3 = new Question();
        q3.setId(12);
        q3.setQuestion("What is you favorite color?");
        q3.setAnswer("Blue.");


        System.out.println("Question 1 - " + q1.getQuestion() +": "+  q1.getAnswer());
        System.out.println("Question 2 - " + q2.getQuestion() +": "+  q2.getAnswer());
        System.out.println("Question 3 - " + q3.getQuestion() +": "+  q3.getAnswer());


    }
}
