import org.testng.annotations.Test;

public class StringVowels {

	public boolean isVowelPresent(String s) {
		return s.matches(".*[aeiou].*");
	}
	@Test
	public void vowels() {
		String s = "Hello";
		
		System.out.println(isVowelPresent(s));
		
	}
}
