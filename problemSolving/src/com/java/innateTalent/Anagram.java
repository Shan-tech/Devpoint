package com.java.innateTalent;

public class Anagram {
	public static void main(String[] args) {
		String s1="apple", s2="ppale";
		char a[]=s1.toCharArray();
		
		for (int i=0;i<a.length;i++) {
			for (int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		String s=new String(a);
		System.out.println(a);
	}
}
