package org.Array;

public class Mutable {
	
public static void main (String[] args){
		
		//NonLiteralString or mutable--- it will sharing the values in memory.
		
			StringBuffer s1 = new StringBuffer("Preethi");
			
			StringBuffer s2 = new StringBuffer("Vanmugilan");;
			
			System.out.println(System.identityHashCode(s1));
			
			System.out.println(System.identityHashCode(s2));
			
			StringBuffer s3 = s1.append(s2);
			
			System.out.println(s3);
			
			System.out.println(System.identityHashCode(s3));	
}
}
