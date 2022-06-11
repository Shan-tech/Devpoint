package com.java.tricky;

public class EvenOrOddWithoutModulo {

    public static boolean isEven(int n){
    	while(true){
		    n-=2;
		    if(n==0)
		        return true;
		    else if(n<0)
		        return false;
    	}
    }
	public static void main(String[] args) {
	    int n=59;
	    System.out.println(isEven(n));
	}
}

