package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Set {
			
		public static void main (String[] args){
		
			List<Integer> l = new LinkedList<>();
			
			l.add(10);
			l.add(20);
			l.add(30);
			l.add(40);
			l.add(10);
			// to replace the value of particular index ----- set();
			l.set(2, 35);
			l.add(2, 60);
			
			System.out.println("**************l**********");
			
			for(int i = 0; i < l.size();i++){
				
				System.out.println(l.get(i));
			}
}
}