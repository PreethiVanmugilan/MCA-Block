package org.controlStatements;

public class SystemExit {

public static void main (String[] args){
		
		for (int i =1; i <= 100; i++){
			
			if(i/2 == 4){
				
			System.out.println("value is :"+i);
			System.exit(0);
			}else{
				
			System.out.println(i);
		}
	}
		System.out.println("program closed");
}
}
