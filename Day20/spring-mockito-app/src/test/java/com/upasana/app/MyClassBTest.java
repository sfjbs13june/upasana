package com.upasana.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest {
    @InjectMocks
    MyClassB myClassB;
    @Mock
    MyClassA myClassA;

    @Mock
    MyClassC myClassC;
    @BeforeEach
    void setUp(){
        myClassA= Mockito.mock(MyClassA.class);
        myClassC= Mockito.mock(MyClassC.class);
    }

    @Test
    public void TestMethod1A() {
        when(myClassA.getMyStringA(anyString())).thenReturn("your result with msg");
        String result = myClassB.method1A(",msg");
        assertEquals("your result with msg", result);
    }
}
