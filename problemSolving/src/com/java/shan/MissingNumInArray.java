package com.java.shan;

import java.util.Arrays;

public class MissingNumInArray {
	public static void main(String[] args) {
		int n=8,x=-1;
		int[] arr= {7,1,3,2,4,8,5};
		Arrays.sort(arr);
		for(int i =arr[0];i<arr.length;i++) {
			if(i!=arr[i]) {
				x=i;
			}
		}
		if(x==-1) {
			x=arr[n]+1;
		}
		System.out.println("Missing: "+x);
	}
}
