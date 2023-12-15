package org.str;

public class StringProg {
	
	public static void main(String[] args) {
		String s = "Projector";
		int length = s.length();
		System.out.println(length);
		
		String s1 = "general";
		String upperCase = s1.toUpperCase();
		System.out.println(upperCase);
		
		String s2 = "ENCANTO";
		String lowerCase = s2.toLowerCase();
		System.out.println(lowerCase);
        
		String s3 = "Powerful";
		int indexOf = s3.indexOf('r');
		System.out.println(indexOf);
		
		String s4 = "emoootion";
		int last = s4.lastIndexOf('o');
		System.out.println(last);
		
		String s5 = "tent";
		char charAt = s5.charAt(3);
		System.out.println(charAt);
		
		String s6 = "elegant";
		boolean equals = s.equals(s6);
		System.out.println(equals);
		
		String s7 = "encanto";
		boolean ignore = s2.equalsIgnoreCase(s7);
		System.out.println(ignore);
		
		String s8 = "Comments";
		boolean contains = s8.contains("ents");
		System.out.println(contains);
		
		String s9 = "Powerful";
		String replace = s9.replace('f','y');
		System.out.println(replace);
		
		String s10 = "Sky is blue";
		boolean startswith = s10.startsWith("Sky");
		System.out.println(startswith);
		
		String s11 = "Tiger is a powerful animal";
		boolean endswith = s11.endsWith("powerful");
		System.out.println(endswith);
		
		
		
	}

}
