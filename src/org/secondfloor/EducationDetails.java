package org.secondfloor;

public class EducationDetails extends StudentDetails1{
	
	@Override
		public void student(int id) {
		System.out.println("student id is :"+id);
			super.student(id);
		}
	
	public static void main(String[] args) {
		EducationDetails e = new EducationDetails();
		e.student(1234);
		
	}
}
