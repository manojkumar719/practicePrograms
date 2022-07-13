package Test.Test01;

import java.util.HashMap;
import java.util.Map;

public class logSubStringWithoutReapt {
	public static void main(String []args) {
		//abcabbcb
		String str="pwwkew";
		HashMap<String, Integer> map = new HashMap<>();
		String subs="";
		int i=0,j=i;
		int max=0;
		String maxStr="";
		while(j<str.length())
		{
			if(subs.contains(str.charAt(i)+""))
			{
				map.put(subs,subs.length());
					j++;
					i=j;
					subs="";
			}
			else
			{
				subs+=str.charAt(i);
				if(i<str.length()-1)
					i++;
			
			}
			
		}
		for(Map.Entry<String, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
			if(e.getValue()>max)
			{
				max=e.getValue();
				maxStr=e.getKey();
			}
		}
		
		System.out.println("Max substring  from "+str+"- >"+maxStr+"-"+max);
		
	}

}
