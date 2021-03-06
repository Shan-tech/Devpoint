package com.java.virtusa;

//Any message must begin with a dot (.) 
//Any message must end with a dash (-) 
//Every dot (.) must have a corresponding dash (-) after it to close it

public class RoyalMorseCode {

	public static void main(String[] args) {
		String s="...---.-";
		int flag=0;
		if(s.charAt(0)!='.' || s.charAt(s.length()-1)!='-') {
			System.out.println("False");
		}
		
		else {
			int dot=0,dash=0;;
			for (int i = 0,j=0; i < s.length(); i++,j++) {
				if(s.charAt(i)=='.') {
					while(  j<s.length() && s.charAt(j)=='.') {
						dot++;
						j++;
					}
//					System.out.println(j+" "+dot);
					while( j<s.length() && s.charAt(j)=='-' ) {
						dash++;
						j++;
					}
//					System.out.println(j+" "+dash);
					if(dot!=dash) {
						flag=1;
						break;
					}
					else {
						i=j-1;
						j=i;
						dot=0;
						dash=0;
						
					}
				}
			}
		}
		if(flag==0)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
