package com.upasana.app.model;

import org.springframework.stereotype.Component;

@Component
public class Data {
    String id;
    String message;

    public Data()
    {

    }

    public Data(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String toString()
    {
        return "Data : [id = "+id+" message = "+message+"]";
    }




}
