package org.Array;

public class Split {
	
public static void main (String[] args){
		
		String s = "welcome to java";
		String[] s1 = s.split("   ");
		
		// normal array based enhanced for loop
		for (int i = 0; i < s1.length; i++){
			System.out.println(s1[i]);
	}
		
		for (String s2:s1){
			System.out.println(s2);
			
		}
}

}
