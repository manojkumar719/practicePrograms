package Test.Test01;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 15;
		boolean flag = false;
		for(int k=2;k<50;k++) {
			if(k==2 || k==3)
			{
				flag=true;
			}else
			for(int i=2;i<=k/2;i++) {
				if(k%i == 0) {
					flag=false;
					break;
				}
				else
					flag = true;
			}
			if(flag)
				System.out.println(k+" is Prime nunber");
		}
	}

}
