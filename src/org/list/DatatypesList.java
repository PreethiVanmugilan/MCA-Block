package org.list;

import java.util.ArrayList;
import java.util.List;

public class DatatypesList {
	
	public static void main (String[] args){
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		
		System.out.println(l);
		
		System.out.println("****************"); 
		
		// to get a particular value into List ---- get();
		
		System.out.println(l.get(3));
		
		System.out.println("****************"); 
		
		// to know the total values stored into List ---- size();
		
		for(int i = 0; i < l.size(); i++){
			
			System.out.println(l.get(i));
			
		}
		
		System.out.println("****************"); 
		
		for(int k :l){
			
			System.out.println(k);
			
		}
		
		System.out.println("****************"); 
		
		// to know the indexOf particular value ---- indexOf()
		
		int m = l.indexOf(30);
		
		System.out.println(m);
		
		System.out.println("****************"); 
		
		// to know the lastIndexOf particular value ----- lastIndexOf()
		
		int n = l.lastIndexOf(10);
		
		System.out.println(n);
		
		System.out.println("****************"); 
		
		// to remove the particular value from List ---- remove();
		l.remove(4);
		System.out.println("after remove"); 
		
        for(int k :l){
		
        System.out.println(k);
			
		}
		
		System.out.println("****************"); 
				
	}
	
}