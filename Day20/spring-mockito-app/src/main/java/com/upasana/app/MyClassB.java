package com.upasana.app;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class MyClassB {

    @Autowired
    MyClassA myClassA;

    @Autowired
    MyClassC myClassC;

    public String getResult(){
        return "my result";
    }

    public String getMyString(String data){
        return "my result"+data;
    }

    public int getClassCRestult(MyClassC myClassC){
        return  myClassC.getMyAge(20);
    }

    public void NoreturnData(String data){
        System.out.println(data);

    }

    public String method1A(String msg){
        String str= myClassA.getMyStringA(msg);
        return str;
    }

}