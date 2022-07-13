package Test.Test01.StringProgs;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String rev1="";
		String rev2="";
		for(int i=0;i<str.length();i++)
			rev1=str.charAt(i)+rev1;
		System.out.println(rev1);
		
		for(int i=str.length()-1;i>=0;i--)
			rev2=rev2+str.charAt(i);
		System.out.println(rev2);
		
		StringBuffer b = new StringBuffer(str);
		System.out.println(b.reverse());
		
		StringBuilder b2 = new StringBuilder(str);
		System.out.println(b2.reverse());
		
		
	}

}
