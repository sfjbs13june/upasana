package controller;


import com.upasana.app.controller.CalcController;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class OperationControllerTest {
    @Test
    public void testAdd()
    {
        long a;
        a = (long)2.0;
        long b;
        b = (long)2.0;
        long result = a+b;
        long res = CalcController.add(a,b);
        Assert.assertEquals(result,res);

    }


}
