package Test.Test01.Collections;

import java.util.HashMap;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "collectionssssssssssssss";
		char c[] = s.toCharArray();
		HashMap<Character, Integer> h = new HashMap<>();
		for(char x :c)
		{
			if(h.containsKey(x))
				h.put(x, h.get(x)+1);
			else
				h.put(x, 1);
		}
		System.out.println(h);
	}

}
