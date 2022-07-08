package org.secondfloor;

public class Datas {
	public void demo(){
		byte i = 127;
		byte j = -128;
		System.out.println(i+j);
		
	}
	
	public void datatypes() {
		byte p = 127;
		String q = "12";
		//to convert string into numbers
		//Data Type class.parseDataaType
		int k = Integer.parseInt(q);
		System.out.println(p+k);
		
		int l = 100;
		int m = 100;
		//to convert numbers into string
		String s = String.valueOf(m);
		System.out.println(l+s);
	}
	
	public int sum() {
		// void no return statement
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		return c;
	
	}
	
	public void subtraction() {
		int i =sum();
		System.out.println(20+i);
	}
	 public String name() {
		 String s = "preethi";
		 return s;
	 }
	public void employeeId() {
		int id = 12345;
	    System.out.println("Employee Id is :"+id);
	    
	    long phone = 6381375767l;
	    System.out.println("Employee phone number is :"+phone);
	    
	    float sal = 20000;
	    System.out.println("Employee sal is :"+sal);
	    
	    Double hugeAmount = 7634568921d;
	    System.out.println("Employee annual package is :"+hugeAmount);
	    
	    char gender = 145;
	    System.out.println("Employee gender is :"+gender);
	    
	    String name = "Vanmugilan";
	    System.out.println("Employee name is :"+name);
	    
	    String mail = "Vanmugilan@gmail.com";
	    System.out.println("Employee mail Id is :"+mail);
	    
	    boolean status = true;
	    System.out.println(status);  
	   
	}
	
    public static void main(String[] args){
	Datas d = new Datas();
	d.employeeId();
	d.datatypes();
	d.subtraction();
	d.toString();
	
     }
}
