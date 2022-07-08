package org.controlStatements;

public class Continue {

public static void main (String[] args){
		
		for(int i =1; i <= 100; i++){
			
			if (i == 5){
				
			System.out.println("value is 10");
			
			continue;
			
			}else if(i == 10){
				
			System.out.println("value is 10");
			
			continue;
			
			}else if(i == 15){
				
			System.out.println("value is 15");
			
			break;
			
			}else{
				
			System.out.println("condition not satisfied :"+i);
			}
		}
}
}
