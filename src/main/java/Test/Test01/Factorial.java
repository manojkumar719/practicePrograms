package Test.Test01;

public class Factorial {

	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		else 
			return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		System.out.println(i +"! ->"+fact(i));

	}

}
