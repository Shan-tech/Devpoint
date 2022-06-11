package com.java.virtusa;
import java.util.*;
public class StrRevByWord {
	public static void main(String[] args) {
		String s1="Hey there programmer";
        String t="";
        List<String> arr=new ArrayList<String>();
        for(char c: s1.toCharArray()){
            t+=c;
            if(c==' '){
                arr.add(t);
                t="";
            }
        }
        arr.add(t);
        Collections.reverse(arr);
        System.out.println(String.join(" ", arr) );
	}
}
