package Test.Test01;

import java.util.HashMap;
import java.util.Map;

public class AmazonProg {

	public static void main(String[] args) {
		String str = "amazing";
		String [] chars = str.split("");
		HashMap <String, Integer> maxSubstr = new HashMap();
		String ss="";
		String max="";
		int maxI=0;
//		for(int i=0;i<chars.length;i++)
//		{
//			String s=chars[i];
//		    if(!ss.contains(s))
//		    {
//		        ss+=s;
//		    }
//		    else{
//		        maxSubstr.put(ss,ss.length());
//		        ss="";
//		        ss+=s;
//		    }
//
//		}
//		maxSubstr.put(ss, ss.length());
		int i=0,j=0;
		while(j<chars.length)
		{
			if(!ss.contains(chars[i]))
			{
				ss+=chars[i];
				if(i<chars.length-1)
					i++;
				
			}
			else {
				maxSubstr.put(ss,ss.length());
				if(j<chars.length)
					++j;
				i=j;
				ss="";
				
			}
		}
		for(Map.Entry<String,Integer> m:maxSubstr.entrySet())
		{
		    if(maxI<m.getValue()) {
		        max=m.getKey();
		        maxI=m.getValue();
		    }
		    System.out.println(m.getKey()+"->"+m.getValue());
		}
		System.out.println(max);

	}

}
