package com.java.virtusa;

public class NthCharDecrypt {

	public static void main(String[] args) {
		String s="a1b2c3";
		String str="";
		for (int i=0; i<s.length();i++) {
			if(i%2!=0) {
				for(int j=0; j< (s.charAt(i)-'0') ;j++) {
					str+=s.charAt(i-1);
				}
			}
		}
		System.out.println(str);
	}

}
