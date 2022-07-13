package Test.Test01.StringProgs;

public class PatternMatching {

	public static boolean isNumberPresent(String s)
	{
			return s.matches(".*[0-9].*");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hellooo";
		System.out.println(isNumberPresent(s));
	}

}
