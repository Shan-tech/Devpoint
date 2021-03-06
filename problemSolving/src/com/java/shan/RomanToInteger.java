package com.java.shan;


import java.util.*;

public class RomanToInteger {
	public static void main(String[] args) {
		Map<Character, Integer> roman=new HashMap<Character, Integer>();
	    roman.put('I',1);
	    roman.put('V',5);
	    roman.put('X',10);
	    roman.put('L',50);
	    roman.put('C',100);
	    roman.put('D',500);
	    roman.put('M',1000);
	    
        String s="IVVI"; //
        
        int value=0,flag=-1;
        for(int i=0;i<s.length()-1;i++){
            // System.out.println(i);
            
            if(i!=s.length()-1 || (i!=s.length()-1 && flag!=0) ){
                flag=-1;
                if( roman.get(s.charAt(i)) >= roman.get(s.charAt(i+1)) ){
                value+=roman.get(s.charAt(i+1))+ roman.get(s.charAt(i));
                }
                else{
                    value+=roman.get(s.charAt(i+1))- roman.get(s.charAt(i));
                    flag=0;
                }
//                System.out.println(value);
            }
            else{
                value+=(roman.get(s.charAt(s.length())));
//                System.out.println("value");
            }
            
            
        }
        System.out.println(value);
	}
}
