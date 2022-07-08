package org.concept;

public class Bank {
	
	public Bank(){
		System.out.println("default constructor");
	}
	
	public Bank(int id){
		System.out.println("argument based constructor");
		
	}
	
	public void welcome(){
		System.out.println("welcome");
		
	}
	
    public static void main(String[] args){
		
		Bank b = new Bank();
		Bank b1 = new Bank(1234);
    }
}
