package com.java.shan;

public class MaxCountNum {

	public static void main(String[] args) {
		int a=123,b=587,c=373,d=134;
	    int w,x,y,z;
		int[] arr={0,0,0,0,0,0,0,0,0,0};
	    while(a>0){
	        w=a%10; 
	        a/=10;
	        
	        x=b%10; 
	        b/=10;
	        
	        y=c%10; 
	        c/=10;
	        
	        z=d%10; 
	        d/=10;
	        
	        arr[w]++;
	        arr[x]++;
	        arr[y]++;
	        arr[z]++;
	        
	    }
	    int max=0;
	    for( int i=0;i<arr.length-1;i++){
	        System.out.print(arr[i]+" ");
	        if(max<arr[i]){
	            max=i;
	        }    
	    }
	    System.out.println("\n"+max);
	}

}
