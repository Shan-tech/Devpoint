package com.java.innateTalent;
import java.util.*;
public class FrequencyOfEleInArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,2,12,54,3,3};
		int b[]=new int[a.length-1];
		int count=0;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if( a[i]==a[j]) {
					count++;
				}
			}
			b[i]=count;
			count=0;
		}
		System.out.println(Arrays.toString(b));
	}

}
