package Test.Test01;

import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test
	public void testDemo() {
		
		System.out.println("Hello");
		DemoTest1 d = new DemoTest1();
		System.out.println(d.getClass());
		
	}

}
