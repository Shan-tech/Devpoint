package com.java.shan;

import java.util.ArrayList;
import java.util.List;

public class zeroInMatris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,0,6,7},{1,3,2,0},{5,1,9,4}};
		List<Integer> row=new ArrayList<Integer>();
		List<Integer> column=new ArrayList<Integer>();

		System.out.println("Before: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==0) {
					row.add(i);
					column.add(j);
				}
				
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\nAfter: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(row.contains(i) || column.contains(j)) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}		
	}

}
