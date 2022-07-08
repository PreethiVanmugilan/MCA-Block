package org.String;

public class Words {
	
	public static void main (String[] args){
		
		String s = "welcome to java";
		
		// To find the length of the String ----length()
		
		int a = s.length();
		System.out.println(a);
		
		// to get particular character from String ---charAt()
		for (int i =0; i < s.length(); i++){
    	char ch = s.charAt(i);
   		System.out.println(ch);
       }
		char ch = s.charAt(0);
   		System.out.println(ch);
       
   //To validate a particular letter or words present in String ---- contains()
       boolean b = s.contains("java");
       System.out.println(b);
       
   //To convert small letters into capital ---- to Upper Case
		String c = s.toUpperCase();
		System.out.println(c);
		
   //To convert Capital letters into Small ---- to Lower Case
		String d = c.toLowerCase();
		System.out.println(d);
		
   //To validate both strings are equal ----- equals()
		boolean e = c.equals(d);
		System.out.println(e);
		
   //To validate both strings are equal without considering case sensitive ----equalsIgnoreCase()
		boolean f = c.equalsIgnoreCase(d);
		System.out.println(f);
		
   //To validate the starting letter of the string ---- startsWith()
		boolean g = s.startsWith("w");
		System.out.println(g);
		
   //To validate the ending letter of the string ---- endsWith()
		boolean h = s.endsWith("a");
		System.out.println(h);
	
   //To know the index of particular character/letter/numbers ---- indexOf()
		int j = s.indexOf('e');
		System.out.println(j);
		
   //To know the last index of particular character/letter/numbers ---- lastIndexOf()
    	int k = s.lastIndexOf('e');
    	System.out.println(k);
    	
   //To remove the unwanted space --- trim()
    	String s1 = "        welcome to java       "; 
    	String l = s1.trim();
    	System.out.println(l);
    	
   //To cut the string ----subString()
    	String m = s.substring(8, 10);
    	System.out.println(m);
    	
   //To replace particular character/word ---- replace()
    	String n = s.replace("java", "selenium");
    	System.out.println(n);
    	
    	String o = s.replace('e', 'n');
    	System.out.println(o);  	
    	
	}
}