package Test.Test01.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ArrayToList {
	
	@Test
	public void test() {
		
		int a[] = {1,2,3,4,5,6};
		List l = Arrays.stream(a).boxed().collect(Collectors.toList());
	}

}
