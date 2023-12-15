package com.app.core;

public class GrowableStack implements Stack
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
			Customer[] growableArray=new Customer[(customers.length)*2];

			for(int i=0;i<customers.length;i++)
			{
				growableArray[i]=customers[i];				
			}
			customers=growableArray;
			top=top+1;
			
		
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
	
