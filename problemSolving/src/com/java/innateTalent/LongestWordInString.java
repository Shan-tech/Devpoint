package com.java.innateTalent;

public class LongestWordInString {

	public static void main(String[] args) {
		String s="Hey hello how are you";
		String word[]=s.split(" "); 
		// split("[\\s,]") splits space as well as , 
		// but if both comes immediately, use split("[\\s,]+")
		String max=word[0];
		for(int i=0; i<word.length;i++) {
			if(max.length()<word[i].length()) {
				max=word[i];
			}
		}
		System.out.println(max);
	} 

}
