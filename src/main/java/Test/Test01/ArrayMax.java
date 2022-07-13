package Test.Test01;

public class ArrayMax {

	public static void main(String[] args) {
		int x[] = { 2, 43, 22, 44, 32, 56, 780, 779, 4, 12, 0, 789, 1 };
		int sum=0, a=0,b=0;
		for(int i=0;i<x.length-2;i++)
		{
			if(sum < x[i]+x[i+1])
			{
				sum = x[i] + x[i+1];
				a = i;
				b = i+1;
			}
			
		}
		
		System.out.println("Max="+sum+"\nindex1="+a+"\nindex2="+b);

	}

}
