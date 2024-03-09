package com.basics;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str = "Ja&v@aS^cr)ip$t*";
		String plainstring = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainstring);
		
		
	}

}
