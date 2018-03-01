package com.item.af;

public class AvoidCreatingUnnecessaryObjects {

	public static void main(String[] args) {
		
		// Good examples
		String str = String.valueOf("Hello");
		String str1 = "Hello";
		
		// Bad example
		String str2 = new String("Hello");
		
		// Note that defensive copying is more important than avoid creating unnecessary objects because it is (insidious bugs and security holes) vs. (style and performance) 
	}
	
}
