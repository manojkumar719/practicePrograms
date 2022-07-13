package Test.Test01.Collections;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayListTraversal {

	@Test
	public void arrayList() {
		ArrayList l = new ArrayList<>();
		l.add("Hi");
		l.add(1);
		l.add(true);
		l.add(10.2);
		for(Object o : l)
			System.out.println(o.toString());

	}
}
