package org.secondfloor;

public class StudentDetails1 {

	public void student() {
		int id = 12345;
		System.out.println("student id is :"+id);
	}
	
	public void student(int id) {
		System.out.println("int arg id is :"+id);
		
}
	
	public void student(String id) {
		System.out.println("student mail id is :"+id);
		
	}
	
	public void student(String name,long phone) {
		System.out.println("student mail id is :"+name);
		System.out.println("student phone is :"+phone);
		
	}

	public void student(long name,String phone) {
		System.out.println("student mail id is :"+name);
		System.out.println("student phone is :"+phone);
		
	}
	
	public static void main(String[] args) {
			StudentDetails1 s = new StudentDetails1();
			s.student();
			s.student(1234);
			s.student("vanmugilan@gmail.com", 9092754890l);
			s.student("vanmugilan",6381375767l);
			
	}
}
