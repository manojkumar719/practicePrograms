package Test.Test01;

public class Fibonaci {
	
	public static int fib(int n) {
		if(n<=1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		System.out.print(fib(i)+", ");

	}

}
