package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceOccurance {

	public static void main(String[] args) {
		
		String str = "javaxpersistence";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string : ");
		//String str = sc.nextLine();
		char ch = 'z';
		
		char[] cha = str.toCharArray();
		int count = 1;
		
		//check given char is in string or not
//		if(str.indexOf(ch) == -1)
//		{
//			System.out.println("Given character is not in string");
//			System.exit(0);
//			
//		}
		
		for(int i=0; i<=cha.length-1; i++)
		{
			if(cha[i] == ch)
			{
				cha[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(cha));
	}

}
