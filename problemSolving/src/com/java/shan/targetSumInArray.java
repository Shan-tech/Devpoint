package com.java.shan;

public class targetSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,15,4,5};
		int target=9;
		        int[] res = new int[2];
		        for (int i=0;i<nums.length;i++){
		            
		            for (int j=i+1;j<nums.length;j++){
		                if (nums[i]+nums[j]==target && i!=j){
		                    res[0]=i;
		                    res[1]=j;
		                    i=nums.length+1;
		                    break;
		                    
		                }
		            }
		            
		        }
		        for (int i = 0; i < res.length; i++) {
		        	System.out.println(res[i]);
				}
		          
		        
		    }
		
	}


