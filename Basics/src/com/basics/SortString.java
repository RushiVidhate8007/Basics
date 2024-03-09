package com.basics;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
//		String str = "tejasandjeevanandsurajandvedantandrushiandparmeshwarandshubhamandkhagesh";
//		char[] ch = str.toCharArray();
//		
//		for(int i=0; i<str.length(); i++)
//		{
//			char temp;
//			for(int j=i+1; j<str.length(); j++)
//			{
//				if(ch[i] > ch[j])
//				{
//					temp = ch[i];
//					ch[i] = ch[j];
//					ch[j] = temp;
//				}
//			}
//		}
		
		//System.out.println(ch);
		//System.out.println(new String(ch));

		//Approach-2
		String str1 = "microbiology";
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
	}

}
