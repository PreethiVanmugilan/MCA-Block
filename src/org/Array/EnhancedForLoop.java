package org.Array;

public class EnhancedForLoop {
	
public static void main (String[] args){
		
		int[] i = new int[6];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		
		// normal array based enhanced for loop
		for (int j : i){
			System.out.println(j);
		}
	}
	
}