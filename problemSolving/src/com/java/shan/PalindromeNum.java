package com.java.shan;

public class PalindromeNum {
	public static void main(String[] args) {
		int n = 121;

		String s = Integer.toString(n);
		String temp = s, rev = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev.equals(temp));

	}
}

// 
//while (n!=0) {
//	m = n % 10;
//	n = n / 10;
//	rev = (rev * 10) + m;
//	System.out.println(m+" "+n+" "+rev); 
//}
//if(rev==temp) {
//	System.out.println("True");
//}
//else {
//	System.out.println("False");
//}