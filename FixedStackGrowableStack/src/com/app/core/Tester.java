package com.app.core;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		//FixedStack fixedStack=new FixedStack();
		//GrowableStack growableStack=new GrowableStack();
		
		Stack ref=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n 1.Fixed Stack.\n 2.Growable Stack. 3.Push details.\n 4.Pop details.\n 5.Exit menu\n ");
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1:
			if(ref==null)
			{
				ref=new FixedStack();
			}
				
			break;
		case 2:
			if(ref==null)
			{
				ref=new GrowableStack();
			}
			break;
		case 3:
	
			break;
		case 4:
	
			break;
		case 5:
	
			break;
		}
		
	}

}
