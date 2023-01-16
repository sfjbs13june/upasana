package com.upasana.app;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class GreetingControllerTest {
    @Test
    public void testSayGreet()
    {
        String expectedresult= "Greetings from App!";
        GreetingController gc = new GreetingController();
        String result = gc.SayGreet();
        Assert.assertEquals(expectedresult,result);
    }

    @Test
    public void testSayWelcome()
    {
        String expectedresult= "Welcome from App!";
        GreetingController gc = new GreetingController();
        String result = gc.SayWelcome();
        Assert.assertEquals(expectedresult,result);


    }

    @Test
    public void testSayHi()
    {
        String expectedresult= "Hie from App!";
        GreetingController gc = new GreetingController();
        String result = gc.SayHi();
        Assert.assertEquals(expectedresult,result);
    }

    @Test
    public void testSayThanks()
    {
        String expectedresult= "Thanks from App!";
        GreetingController gc = new GreetingController();
        String result = gc.SayThanks();
        Assert.assertEquals(expectedresult,result);


    }
}
