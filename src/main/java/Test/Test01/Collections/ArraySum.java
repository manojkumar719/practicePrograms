package Test.Test01.Collections;

public class ArraySum {

	public static void main(String[] args) {
		int [] a = {10,4,3,7,17,5,4,2,4,7,10,5};
		int key = 10;
//		for(int i=0;i<a.length;i++)
//			for(int j=i+1;j<a.length;j++)
//				if(i==j)
//					continue;
//				else
//					if(a[i]+a[j]==key)
//						System.out.println(a[i]+","+a[j]);
		//1. none of sum in the array has the key
//		2. -ve array element and try
//		3. 
		
		int i=0,j=i+1;
		while(i<a.length-1) {
			if(a[i]+a[j]==key) {
				System.out.println(a[i]+", "+a[j]);
			}
			if(j< a.length-1)
				j++;
			else {
				i++;
				j=i+1;
			}
		}

	}

}
