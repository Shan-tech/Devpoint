package com.java.virtusa;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="build",s2="uiBld";
	      int flag=0;
	      
	      if(s1.length()!=s2.length()){
	        flag=1;
	      }
	      char[] c1=s1.toLowerCase().toCharArray();
	      char[] c2=s2.toLowerCase().toCharArray();
	      Arrays.sort(c1);
	      Arrays.sort(c2);
	      if(!(Arrays.equals(c1,c2))){
	          flag=1;
	      }
	        System.out.println(flag);
	        
	}

}
