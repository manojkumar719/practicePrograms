package Test.Test01;

import java.util.HashMap;
import java.util.Map;

public class Inter {

	public static void main(String[] args) {
		String s = "SoftwareTestingMaterial";
		String str[]=s.split("");
		HashMap<String, Integer> m = new HashMap();
		for(String a:str)
		{
		if(m.containsKey(a.toLowerCase()))
		m.put(a,m.get(a)+1);
		else
		m.put(a,1);
		}
		for(Map.Entry<String, Integer> e:m.entrySet())
		 System.out.println(e.getKey()+"->"+e.getValue());
		

	}

}
