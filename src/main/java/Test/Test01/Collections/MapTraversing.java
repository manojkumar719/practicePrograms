package Test.Test01.Collections;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MapTraversing {

	@Test
	public void map() {
		HashMap<Integer, String> h = new HashMap();
		h.put(1,"One");
		h.put(2,"Two");
		h.put(3,"Three");
		h.put(4,"Four");
		
		for (Map.Entry<Integer, String> e : h.entrySet())
			System.out.println(e.getKey() +"->"+e.getValue());
	}
}
