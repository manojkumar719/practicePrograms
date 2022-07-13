package Test.Test01;

public class MethodOverloading {

//	public int add(int a, int b) {
//		int c=a+b;
//		return c;
//	}
	
	public float add(int a, float b) {
		float c=a+b;
		return c;
	}
	public static void main(String[] args) {
		int a=2,b=3;
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.add(a,b));

	}

}
