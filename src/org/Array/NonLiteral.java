package org.Array;

public class NonLiteral {
	
	public static void main (String[] args){
		
		//NonLiteralString --- it will not share the memory for same values.
		
			String s1 = new String("welcome");
			
			String s2 = new String("welcome");;
			
			System.out.println(System.identityHashCode(s1));
			
			System.out.println(System.identityHashCode(s2));
			
	}	

}
