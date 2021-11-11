package com.company;

import java.util.Map;

public class Mushroompicker {
    private Integer levelskill;
    private String name;
    private Integer age;


    public Integer getLevelskill() {
        return levelskill;
    }
    public void setLevelskill(Integer levelskill) {
        this.levelskill = levelskill;
    }


    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }


    public int getAge() {

        return age;
    }
    public void setAge(Integer age) {

        this.age = age;
    }


    public Mushroompicker(String name, Integer levelskill, Integer age) {
        this.name = name;
        this.levelskill = levelskill;
        this.age = age;
    }




}