package com.java.innateTalent;

public class SumElements {

	public static void main(String[] args) {
		int a[]= {19,1,2,3},sum=6;
		int ans=0,f=0;
		
		for (int i=0;i<a.length;i++) {
			for (int j = i; j < a.length; j++) {
				ans+=a[j];
				if(ans==sum) {
					System.out.println(i+","+j);
					f=1;
				}
				else if(ans>sum) {
					ans=0;
					break;
				}
			}
			if(f==1)
				break;
		}
	}

}
