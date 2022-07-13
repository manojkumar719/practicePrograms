package Test.Test01.Collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
	
		int [] a = {8,7,9,1,4};
		
		for(int j=0;j<n;j++) {
			int temp=a[0];
			for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];	
		}
			a[a.length-1]=temp;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
