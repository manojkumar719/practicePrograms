package Test.Test01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Top2Or3OfMap {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int t = s.nextInt();
	        String name = s.nextLine();
	        HashMap<String,Integer> m = new HashMap();
	        ArrayList <Integer> l = new ArrayList();
	        for(int i=0;i<n;i++){
	        	String str=s.nextLine();
	            int v =Integer.parseInt(str.split(" ")[1]);
	            String k = str.split(" ")[0];
	            m.put(k,v); 
	            l.add(v);
	        }
	        System.out.println(m);
	        Collections.sort(l,Collections.reverseOrder());
	        System.out.println(m);
	        int i=0;
	        for(Map.Entry<String,Integer> e:m.entrySet())
	        {
	            if(i<t && e.getValue() == l.get(i))
	            {
	                System.out.println(e.getKey());
	                i++;
	            }
	        }

	}

}
