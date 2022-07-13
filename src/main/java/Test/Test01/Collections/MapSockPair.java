package Test.Test01.Collections;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int cnt=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++)
    {
        int key=ar.get(i);
        System.out.print(key+" ");
    if(map.containsKey(key))
        map.put(key, map.get(key+1));
    else
        map.put(ar.get(i), 1);
    }
    for(Map.Entry<Integer,Integer> e:map.entrySet())
    {
    	System.out.println(e.getKey()+" "+e.getValue());
        int val=e.getValue();
        cnt+=val/2;
    }
    return cnt;
    }

}

public class MapSockPair {
    public static void main(String[] args) throws IOException {
       
    	Scanner s=new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        String [] str = s.nextLine().split(" ");
        int [] ar = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        List <Integer> arr = Arrays.stream(ar).boxed().collect(Collectors.toList());

        int result = Result.sockMerchant(n, arr);

       System.out.println(result);
    }
}
