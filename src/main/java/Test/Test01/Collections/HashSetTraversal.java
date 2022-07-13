package Test.Test01.Collections;

import java.util.HashSet;

import org.testng.annotations.Test;

public class HashSetTraversal {
	@Test
	public void hasSet() {
		HashSet l=new HashSet<>();
		l.add("Hi");
		l.add(1);
		l.add("String");
		l.add(10.2);
		l.add(1);
		
		for(Object o : l)
			System.out.println(o.toString());
	}

}
