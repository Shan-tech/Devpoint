package com.java.virtusa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyInArray {

	public static void main(String[] args) {

		int a[]= {1,1,1,1,1,1};
		Map f=new HashMap<Integer, Integer>(); 
		int count=0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
				else {
					i=j//-1;
					break;
				}
			}
			f.put(a[i],count);
			count=0;
			
			
		}
		System.out.println(f);
	}

}
