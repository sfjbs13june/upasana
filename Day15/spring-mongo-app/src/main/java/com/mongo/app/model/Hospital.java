package com.mongo.app.model;

public class Hospital {
    String name;
    String doctorName;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public Hospital(String name, String doctorName, String address) {
        this.name = name;
        this.doctorName = doctorName;
        this.address = address;
    }



}
