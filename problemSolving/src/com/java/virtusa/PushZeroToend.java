package com.java.virtusa;

import java.util.ArrayList;
import java.util.Arrays;

public class PushZeroToend {

	public static void main(String[] args) {
		int a[]= {1,0,2,3,4,0,0,5};
		int count=0;
//		ArrayList<Integer> nums=new ArrayList<Integer>();
//
//		for(int i=0; i< a.length;i++) {
//			if(a[i]!=0) {
//				nums.add(a[i]);
//			}
//			else
//				count++;
//		}
//		while(count>0) {
//			nums.add(0);
//			count--;
//		}
		for(int i=0; i< a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
	
		System.out.println(Arrays.toString(a)); // return nums.toArray()
	}

}
