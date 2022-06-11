package com.java.virtusa;

public class PalindromeCount {

	public static boolean palindrome(String str) {
		String temp="";
		for(int j=str.length()-1; j>=0; j--) {
			temp+=str.charAt(j);
		}
		if (temp.equals(str))
				return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String s[]= {"Hi","aba","aabaa","acv"};
		int count=0;
		for (int i=0; i<s.length; i++) {
			if(palindrome(s[i]))
				count++;
		}
		System.out.println(count);
	}

}
