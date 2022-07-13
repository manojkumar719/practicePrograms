package Test.Test01.Collections;

import java.util.Arrays;

public class ArrayWithLessValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[15];
		a[0]=1;
		a[1]=2;
		a[3]=4;
		System.out.println(Arrays.toString(a));
		for(int i:a)
			System.out.print(i+", ");

	}

}
