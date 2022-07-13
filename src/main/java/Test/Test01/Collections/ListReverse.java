package Test.Test01.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverse {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<Integer> l2;
		l.add(2);
		l.add(1);
		l.add(4);
		l.add(3);
		int p1=0,p2=0, flag=0;
        while(l.iterator().hasNext())
        {
        	if(flag==0)
        	{
        		p1+=l.get(0);
        		flag=1;
        	}
        	else {
        		p2+=l.get(0);
        		flag=0;
        	}
        	l.remove(0);
            if(l.size()>1&&l.get(0)%2 == 0)
            	Collections.reverse(l);
        }
        if(p1>p2)
           System.out.println(p1-p2);
        else
            System.out.println(p2-p1);
    }
		

}