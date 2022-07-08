package org.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.List;
import java.util.Map;

import org.secondfloor.EmployeeData;

public class UserdefinedList {
	
public static void main(String[] args){
		
		EmployeeData Vanmugilan = new EmployeeData();
		Vanmugilan.setRollno(1);
		Vanmugilan.setStd(3);
		Vanmugilan.setEmail("Vanmugilan@gmail.com");
		Vanmugilan.setPhone(4567890123l);
		Vanmugilan.setName("Vanmugilan");
		
		EmployeeData Preethi = new EmployeeData();
		Preethi.setRollno(2);
		Preethi.setStd(5);
		Preethi.setEmail("Preethi@gmail.com");
		Preethi.setPhone(5567890123l);
		Preethi.setName("Preethi");
		
		EmployeeData Rohith = new EmployeeData();
		Rohith.setRollno(3);
		Rohith.setStd(8);
		Rohith.setEmail("Rohith@gmail.com");
		Rohith.setPhone(6567890123l);
		Rohith.setName("Rohith");
		
		//User Defined List
		List<EmployeeData> l = new ArrayList<>();
		l.add(Vanmugilan);
		l.add(Preethi);
		l.add(Rohith);
		
        for(int i = 0; i < l.size(); i++){
			
			System.out.println(l.get(i).getRollno()+"   "+l.get(i).getStd()+"   "+l.get(i).getEmail()+"     "+l.get(i).getPhone()+"    "+l.get(i).getName());
			
		}
         System.out.println("   ");
         
        //User Defined Set
        Set<EmployeeData> s = new HashSet<>();
        s.add(Vanmugilan);
		s.add(Preethi);
		s.add(Rohith);
		 for(EmployeeData s1 : s){
				
			 System.out.println(s1.getRollno()+"   "+s1.getStd()+"   "+s1.getEmail()+"    "+s1.getPhone()+"     "+s1.getName());
				
			}
		 System.out.println("   ");
		 
		 //User Defined Map
		 Map <Integer, String> m = new HashMap<>();
		 m.put(1, "Vanmugilan");
		 m.put(2, "Preethi");
		 m.put(3, "Rohith");
		 
		 Set<Entry<Integer, String>> entrySet = m.entrySet();
			for(Entry<Integer, String> entry : entrySet){
				System.out.println(entry.getKey()+"   "+entry.getValue());
			}
						
}		
}