package com.stackroute.domain;

public class Actor {
    private String actorName;
    private String actorGender;
    private int actorAge;

    public Actor(String name, String gender, int age) {
        this.actorName= name;
        this.actorGender = gender;
        this.actorAge = age;
    }

    public Actor() {
        System.out.println("Actor");
    }

    public String getName() {
        return actorName;
    }

    public void setName(String name) {
        this.actorName = name;
    }

    public String getGender() {
        return actorGender;
    }

    public void setGender(String gender) {
        this.actorGender = gender;
    }

    public int getAge() {
        return actorAge;
    }

    public void setAge(int age) {
        this.actorAge = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + actorName + '\'' + ", gender='" + actorGender + '\'' + ", age=" + actorAge + '}';
    }
}