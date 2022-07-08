package org.secondfloor;

public class EmployeeDetails {

	public static void main(String[] args){
		
		EmployeeData Vanmugilan = new EmployeeData();
		Vanmugilan.setRollno(1);
		Vanmugilan.setStd(3);
		Vanmugilan.setEmail("Vanmugilan@gmail.com");
		Vanmugilan.setPhone(4567890123l);
		Vanmugilan.setName("Vanmugilan");
		
		EmployeeData Preethi = new EmployeeData();
		Preethi.setRollno(2);
		Preethi.setStd(5);
		Preethi.setEmail("Preethi@gmail.com");
		Preethi.setPhone(5567890123l);
		Preethi.setName("Preethi");
		
		EmployeeData Rohith = new EmployeeData();
		Rohith.setRollno(3);
		Rohith.setStd(8);
		Rohith.setEmail("Rohith@gmail.com");
		Rohith.setPhone(6567890123l);
		Rohith.setName("Rohith");
		
		System.out.println(Vanmugilan.getRollno() +" "+Vanmugilan.getStd() +" "+Vanmugilan.getEmail() +" "+Vanmugilan.getPhone() +" "+Vanmugilan.getName());
		System.out.println(Preethi.getRollno() +" "+Preethi.getStd() +" "+Preethi.getEmail() +" "+Preethi.getPhone() +" "+Preethi.getName());
		System.out.println(Rohith.getRollno() +" "+Rohith.getStd() +" "+Rohith.getEmail() +" "+Rohith.getPhone() +" "+Rohith.getName());
		
	}


}
