package org.concept;

public class Bank1 extends Employee {
	
	public Bank1(){
		this(1234);
		System.out.println("default constructor");
	}
	
	public Bank1(int id){
		this("preethi");
		System.out.println("int argument based constructor :"+id);
		
	}
	public Bank1(String name){
		System.out.println("string argument based constructor :"+name);
		
	}
	
	public void welcome(){
		System.out.println("welcome");
		
	}
	
    public static void main(String[] args){
		
		Bank1 b = new Bank1();
    }
}