package org.list;

import java.util.ArrayList;
import java.util.List;

public class DatatypesList1 {
	
	public static void main (String[] args){
	
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
				
		System.out.println("**************l**********");
		
		for(int i = 0; i < l.size();i++){
			
			System.out.println(l.get(i));
		}
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(100);
		l1.add(200);
		
		System.out.println("************before add l into l1*********");
		for(int i = 0; i < l1.size(); i++){
			System.out.println(l1.get(i));
		}
		
		l1.addAll(l);
		System.out.println("************after add l into l1*********");
		for(int i = 0; i < l1.size(); i++){
			System.out.println(l1.get(i));
		}
		
		//to validate both list are equals-----equals()
		boolean a = l1.equals(l);
		System.out.println(a);
		
		l1.retainAll(l);
		System.out.println("************after retain l from l1*********");
		for(int i = 0; i < l1.size(); i++){
			System.out.println(l1.get(i));
		}
		
		l1.removeAll(l);
		System.out.println("************after remove l from l1*********");
		for(int i = 0; i < l1.size(); i++){
			System.out.println(l1.get(i));
		}
		
		
	}
}