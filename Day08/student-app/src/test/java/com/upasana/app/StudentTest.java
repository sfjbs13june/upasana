package com.upasana.app;

import com.upasana.app.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    public void getStudentTest(){

        List listStudent = new ArrayList();
        Student student1 = new Student("ABC", "001", "5th", "PLS");
        Student student2 = new Student("DEF","002", "6th", "JBS");
        Student student3= new Student("GHI","003","7th","DGS");

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        Assert.assertEquals(listStudent.size(),3);



    }
}
