package com.java.virtusa;

public class PairsOfHCF {
	public static int hcf(int a, int b) {
		int factor = 0;
		for(int i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 ) {
	        	 factor=i;
	         }
	         
	      }
		return factor;
	}

	public static void main(String[] args) {
		int n=4;
		int count=0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if( hcf(i,j)==1 ) {
					System.out.println(i+","+j);
					count ++;
				}
			}
		}
		System.out.println(count);
	}

}
