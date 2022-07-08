package org.Array;

public class Storage {
	
	public static void main (String[] args){
		
		int[] i = new int[6];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		
		// normal array based for loop
		for (int j = 0; j < i.length; j++){
			System.out.println(i[j]);
		}
	}

}
