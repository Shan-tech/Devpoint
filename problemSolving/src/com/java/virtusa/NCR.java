package com.java.virtusa;

public class NCR {
	 public static int fact(int x){
		    int res=1;
		    while(x>0){
		        res*=x;
		        x--;
		    }
		    return res;
		}

		  public static void main (String[]args)
		  {
		    int n=3,r=2,m=1000000009;
		    int ncr=fact(n) / ( fact(r) * fact(n-r));
		   
		    System.out.println(ncr%m);
		  }
}
