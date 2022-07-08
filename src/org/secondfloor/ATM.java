package org.secondfloor;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println("Your name is :"+name);
		
		System.out.println("Enter your mailId");
		String mailId = s.nextLine();
		System.out.println("Your name is :"+mailId);
		
		System.out.println("Enter your Pin number");
		int pin = s.nextInt();
		System.out.println("Your pin number is :"+pin);
		
		System.out.println("Enter your phone number");
		long phone = s.nextLong();
		System.out.println("Your phone number is :"+phone);
		
		
		System.out.println("Enter your amount");
		float salary = s.nextFloat();
		System.out.println("Enter is :"+salary);
		
		System.out.println("do you want to continue");
		boolean b = s.nextBoolean();
		System.out.println("Your option is :"+b);
	}
}
