package org.Array;

public class Literal {
	
public static void main (String[] args){
		
	//LiteralString --- it will share the memory for same values.
	
		String s1 = "welcome";
		
		String s2 = "welcome";
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
}	
}