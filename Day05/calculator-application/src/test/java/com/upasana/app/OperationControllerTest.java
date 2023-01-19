package com.upasana.app;


import com.upasana.app.controller.CalcController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.sql.SQLOutput;


public class OperationControllerTest {

    CalcController calculatorController = new CalcController();
    @Test
    public void addTest(){

        long result = calculatorController.add(10,20);
        System.out.println(result);
        Assertions.assertEquals(result,30);
    }

    @Test
    public void subTest(){

        long result = calculatorController.sub(13, 4);
        System.out.println(result);
        Assertions.assertEquals(result,9);

    }

    @Test
    public void mulTest(){
        long result = calculatorController.mul(3,6);
        System.out.println(result);
        Assertions.assertEquals(result,18);

    }

    @Test
    public void divTest(){

        long result = calculatorController.div(10,5);
        System.out.println(result);
        Assertions.assertEquals(result,2);

    }


}
