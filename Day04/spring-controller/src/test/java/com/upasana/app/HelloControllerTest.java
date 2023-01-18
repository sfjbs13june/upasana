package com.upasana.app;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class HelloControllerTest {


    @Test
    public void testSayHello()
    {
        String expectedresult= "Hello from App!";
        HelloController hc = new HelloController();
        String result = hc.SayHello();
        Assert.assertEquals(expectedresult,result);


    }

    @Test
    public void testSayRequestHello()
    {
        String expectedResult= "Hello from Request Hello!";
        HelloController hc = new HelloController();
        String result = hc.RequestHello();
        Assert.assertEquals(expectedResult,result);


    }

    @Test
    public void testWelcome()
    {
        String name= "India";
        String expectedResult= "Welcome to India";
        HelloController hc = new HelloController();
        String result = hc.welcome(name);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testSendMessage()
    {
        String message= "world";
        String expectedResult="Send Message : "+ message;
        HelloController hc = new HelloController();
        String result = hc.sendMessage(message);
        Assert.assertEquals(expectedResult,result);


    }

}
