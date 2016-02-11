package controller;

import view.RecursionFrame;
import model.RecursionTool;

public class RecursionController 
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
	}
	public void start()
	{
		calculatedValue = Integer.toString(mathTool.getFibNumber(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{
		calculatedValue = "the fibbonacci sequence number of" + inputValue + " is " + Integer.toString(mathTool.getFibNumber(Integer.parseInt(inputValue)));
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		calculatedValue = "the factorial of" + inputValue + " is " + Integer.toString(mathTool.getFactorialNumber(Integer.parseInt(inputValue)));
		
		return calculatedValue;
	}
}
