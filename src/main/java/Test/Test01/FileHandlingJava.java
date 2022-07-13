package Test.Test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileHandlingJava {
	public static void main(String args[]) throws Exception {
		Scanner s  = new Scanner(new File("D:/Auto.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		while(s.hasNext()) {
			String str = s.next();
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		}
		System.out.println(map);
			
		
	}

}
