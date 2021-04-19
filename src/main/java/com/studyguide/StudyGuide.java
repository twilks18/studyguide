package com.studyguide;

import java.util.List;

public class StudyGuide {

    /*
     * StudyGuide is the name of this class/object
     * private is a java keyword and it is an access modifier
     * access modifiers determine what fields or methods that can be accessed by other classes
     * int is a java keyword that identifies a field or method type
     * the id is the name of a field for this class
     */
    private int id;
    private String name;
    private List<Chapter> chapters;

    /**
     *
     * Arg constructor which means this constructor contains arguments
     * This constructor is going to be used to construct our object/subject
     *
     */
    public StudyGuide(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * No arg constructor which means this constructor does not contain arguments
     * This constructor is going to be used to construct our object/subject
     */
    public StudyGuide() {
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
