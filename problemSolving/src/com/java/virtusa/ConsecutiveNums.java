package com.java.virtusa;
import java.util.*;
public class ConsecutiveNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-3,-1,1,0};
	    Arrays.sort(a);
	    int flag=0,dif=a[0]-a[1];   
	    for(int i=0;i<a.length-1;i++){
	        if (!(dif==a[i]-a[i+1])){
	            // System/.out.println("No");
	            // break;
	            flag=1;
	        }
	    }
	    if(flag==0)
	        System.out.println("yes");
	    else
	        System.out.println("No");
	  }
	}


