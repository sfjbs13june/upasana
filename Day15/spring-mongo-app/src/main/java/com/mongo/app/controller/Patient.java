package com.mongo.app.controller;

public class Patient {
    String patId;
    String name;
    int age;
    String gender;
    String disease;


    public Patient(String patId, String name, String gender, String disease, int age) {
        this.patId = patId;
        this.name = name;
        this.gender = gender;
        this.disease = disease;
        this.age = age;
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
