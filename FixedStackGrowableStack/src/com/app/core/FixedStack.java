package com.app.core;

public class FixedStack implements Stack
{
	private Customer[] customers=new Customer[STACK_SIZE];
	private int top=-1; 
	//{all toString}
	
	
	public void push(Customer details)
	{
		if (top<customers.length-1)
		{
			customers[++top]=details;
			System.out.println("Success");
		}
		else
		{
			System.out.println("Stack overflow");
		
		}
	
		
}

   public Integer pop()
   {
	if(top==-1)
	{
		System.out.println("Stack is empty");
		return null;
	}
	
	else
	{
		if(top==customers.length)
		{
			
			return top=top-1;
			
		}	
	}
	return 0;
	
}
	
}