package Test.Test01;

import java.util.HashMap;
import java.util.Map;

public class TestClassOne {

	public static void main(String[] args) {
		String str = "my name is manoj kumar";
		HashMap<String, Integer> m = new HashMap<>();
		String [] sArr = str.split("");
		for(String s:sArr)
			if(m.containsKey(s))
				m.put(s, m.get(s)+1);
			else
				m.put(s, 1);
		for(Map.Entry<String, Integer> e:m.entrySet())
			if(e.getValue()>2)
				System.out.println(e.getKey()+" -> "+e.getValue());

	}

}
