package com.java.innateTalent;
import java.util.*;
public class DelElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 6, 8, 43, 20 }; // remove 8
		int r = 2;
		int b[] = new int[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (i < r) {
				b[i] = a[i];
			} else if (i > r) {
				b[i - 1] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
