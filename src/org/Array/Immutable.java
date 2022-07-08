package org.Array;

public class Immutable {
	
	public static void main (String[] args){
		
		//Immutable String or LiteralString --- it will not sharing the values in memory.
		
			String s1 = "Preethi";
			
			String s2 = "Vanmugilan";
			
			System.out.println(s1+System.identityHashCode(s1));
			
			System.out.println(s2+System.identityHashCode(s2));
			
			String s3 = s1.concat(s2);
			
			System.out.println(s3+System.identityHashCode(s3));
	}

}
