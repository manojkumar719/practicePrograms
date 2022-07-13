package Test.Test01;

import org.testng.annotations.Test;

public class StringKiranOne {
	
	@Test
	public void method1() {
		String s="AAAADDDCCCA";
		String n="";
		String strArr[] = s.split("");
		int count=1;
		for(int i=0;i<strArr.length;i++) {
			if(i+1 == strArr.length)
				n+=strArr[i]+count;
			else if(strArr[i].equalsIgnoreCase(strArr[i+1]))
				++count;
			else {
				n+=strArr[i]+count;
				count=1;
			}
		}
		System.out.println(n);
	}

}
