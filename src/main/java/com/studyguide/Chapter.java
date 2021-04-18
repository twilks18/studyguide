package com.studyguide;

import java.util.List;

public class Chapter {
    /**
     * chapter is the name of this class/object i
     * private is a java key word and it is an access modifier
     * access modifier dertermines what fields or methods that can be access by other classeses
     * int is a java key word that idenifies a field or method type
     * the id is the name of a field for this class
     */
    private int id;
    private List<Question> questions;
    private String name;

    /*
     *
     * arg(arguements) constructor which means this contructor contains arguements
     * this constructor is going to be use to construct our objects/ chapter
     *
     *
     */
    public Chapter(int identifier, List<Question> questionList, String chapterName) {
        this.id = identifier;
        this.questions = questionList;
        this.name = chapterName;
    }

    /*
    * no arg constructor which means this constrictpr dose not contains arguements
    * this constructor is going to be used to comstruct our objects / objects
     */
    public Chapter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
