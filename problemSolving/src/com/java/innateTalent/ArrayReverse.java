package com.java.innateTalent;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 6, 8, 43, 20, 3 }; // remove 8

		for (int i = a.length - 1, j = 0; i > 0 && j < a.length/2; i--, j++) {
//			System.out.print(a[i] + " " + a[j]);
//			System.out.println();
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		System.out.println(Arrays.toString(a));
	}

}
