package Test.Test01.StringProgs;
import org.testng.annotations.Test;

public class StringVowels {

	public boolean isVowelPresent(String s) {
		return s.toLowerCase().matches(".*[aeiou].*");
	}
	@Test
	public void vowels() {
		String s = "Hello";
		
		System.out.println(isVowelPresent(s));
		
	}
}
