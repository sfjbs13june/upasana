package com.upasana.app;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;


class CalculatorAppApplicationTests {

	CalculatorController calculatorController = new CalculatorController();
	@Test
	public void testAdd()
	{
		double a = 10;
		double b = 20;
		double re =  a + b;
		double result = calculatorController.add(a,b);
		Assert.assertEquals(re,result);
	}
	@Test
	public void testSub()
	{
		double a = 20;
		double b = 10;
		double re = 10;
		double result = calculatorController.sub(a,b);
		Assert.assertEquals(re,result);
	}

	@Test
	public void testMultiply()
	{
		double a = 20;
		double b = 10;
		double re = 200;
		double result = calculatorController.multiply(a,b);
		Assert.assertEquals(re,result);
	}

	@Test
	public void testDivide()
	{
		double a = 20;
		double b = 10;
		double re = 2.0;
		double result = calculatorController.divide(a,b);
		Assert.assertEquals(re,result);
	}

}
