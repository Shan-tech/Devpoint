package com.java.virtusa;

public class FrogPath {

	public static void main(String[] args) {
			//8 1 6 2 1
		int n=8,p=1,f=6,u=2,d=3;
		int c=p,step=0;;
		while(!(c==f)) {
			if(c<f && (c+u)<=n) {
				c+=u;
				step++;
			}
			else {
				c-=d;
				step++;
			}
			System.out.println("-> "+c+": "+step);

		}
		System.out.println("steps: "+step);
	}

}
