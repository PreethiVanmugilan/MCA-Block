package org.secondfloor;

public class StudentDetails {
	
	public void studentID() {
		int id = 12345;
		System.out.println("student id is :"+id);
	}
	
	public void studentEmail(String email) {
		System.out.println("student email id is :"+email);
		
}

	public static void main(String[] args) {
			StudentDetails s = new StudentDetails();
			s.studentID(); 
			s.studentEmail("vanmugilan@gmail.com");
			
	}
}
