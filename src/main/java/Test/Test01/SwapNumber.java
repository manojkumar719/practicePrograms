package Test.Test01;

import org.testng.annotations.Test;

public class SwapNumber {

	@Test
	public void swapNumber() {
		int a=20, b=10;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a ->"+a+"\nb-> "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a ->"+a+"\nb-> "+b);
	}
}
