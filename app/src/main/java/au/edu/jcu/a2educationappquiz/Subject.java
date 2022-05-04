package au.edu.jcu.a2educationappquiz;

import android.content.Intent;

public class Subject {
    public static final int movieTvSubject = 1;
    public static final int mathSubject = 2;
    public static final int sportSubject = 3;

    private String name;
    private Integer id;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}
