package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Datas {

	public static void main (String[] args){
		
		Map<Integer, String> m = new HashMap<>();
		
		// to store value in map ----- put();
		
		m.put(1, "Lesson 1");
		m.put(2, "Lesson 2");
		m.put(3, "Lesson 3");
		m.put(4, "Lesson 4");
		
		System.out.println(m);
		
		// to get a particular value from map ---- get(key);
		
		System.out.println(m.get(3));
		
		System.out.println("************key************");
		
		// to get key alone ---- key set();
		
		Set<Integer> keySet = m.keySet();
		
		for (Integer i : keySet){
			
		System.out.println(i);
		}
		System.out.println("************values************");
		
		//to get values alone ---- values();
		Collection<String> values = m.values();
		for (String s : values){
			
			System.out.println(s);
		}
		
		System.out.println("************entryset************");
		// to iterate map entrySet ----entryset();
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for(Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}
}

