package com.string;

public class StringReverse {
	public static StringBuffer reverseStringBuffer(String s) {
		StringBuffer sb=new StringBuffer(s);
		StringBuffer result=sb.reverse();
		return result;
	}
	
	public static StringBuilder reverseStringBuilder(String s) {
		StringBuilder sb=new StringBuilder(s);
		StringBuilder result=sb.reverse();
		return result;
	}

	public static String charAtMethod(String s) {
		int length=s.length();
		String reverse= "";
		for(int i=length-1; i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		      return reverse;
	}
	
	public static String charArrayMethod(String s) {
		char[] array=s.toCharArray();
		String reverse= "";
	for(int i=array.length-1; i>=0;i--)
	 {
		reverse=reverse+array[i];
	 }
	        return reverse;
  }
	
	public static String reversebyrecursion(String s) {
	    if(s.length()<2) {
	    	return s;
	    }
		return reversebyrecursion(s.substring(1))+s.charAt(0);
	}
	
	public static void main(String[] args) {
		String s= "Live in Java";
		
		System.out.println("StringBuffer Method :- "+reverseStringBuffer(s));
		
		System.out.println("StringBuilder Method :- "+reverseStringBuilder(s));
		
		System.out.println("CharAt Method :- "+charAtMethod(s));
		
		System.out.println("CharArray Method :- "+charArrayMethod(s));
		
		System.out.println("Reverse By Recursion:- "+reversebyrecursion(s));
	}
}

	
	

