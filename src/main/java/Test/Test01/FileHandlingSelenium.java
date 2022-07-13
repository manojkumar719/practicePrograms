package Test.Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FileHandlingSelenium {
	
	@Test
	public void windHandle() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		try{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Manojg/eclipse-workspace/Test01/Test/fileHandling.html");
		Reporter.log("Navigated to Page");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input")).click();
		Actions a = new Actions(driver);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
