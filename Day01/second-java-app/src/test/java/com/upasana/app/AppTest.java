package com.upasana.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{


    public void testSayHi(){
        String expectedResult= "Hi from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHi();
        Assert.assertEquals(expectedResult,result);
    }

    public void testSayWelcome(){
        String expectedResult1= "Welcome from greeting";
        Greeting greeting =new Greeting();
        String result1= greeting.SayWelcome();
        Assert.assertEquals(expectedResult1,result1);
    }

    public void testSayHello(){
        String expectedResult2= "Hello from greeting";
        Greeting greeting =new Greeting();
        String result2= greeting.SayHello();
        Assert.assertEquals(expectedResult2,result2);
    }

    public void testSayBye(){
        String expectedResult3= "Bye from greeting";
        Greeting greeting =new Greeting();
        String result3= greeting.SayBye();
        Assert.assertEquals(expectedResult3,result3);
    }
}
