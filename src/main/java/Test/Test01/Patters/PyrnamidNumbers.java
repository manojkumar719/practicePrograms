package Test.Test01.Patters;

public class PyrnamidNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int j=i;j>0;j--)
				System.out.print("* ");
			System.out.println();
		}
			

	}

}
