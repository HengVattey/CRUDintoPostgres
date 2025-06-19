package com.example.postgres.Entity;

public class ListTeacher {

    Integer id;
    String name;

    public ListTeacher(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public ListTeacher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
