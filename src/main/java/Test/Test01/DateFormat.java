package Test.Test01;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		System.out.println(sdf.format(new Date()));

	}

}
