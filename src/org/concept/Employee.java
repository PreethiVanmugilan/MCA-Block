package org.concept;

public class Employee {
	
	public Employee() {
		this (1234);
		System.out.println("super class default constructor");
}
	
	public Employee(int id) {
		System.out.println("super class argument based constructor :"+id);
		
	}
public static void main(String[] args){
		
		Employee e = new Employee();
    }
}