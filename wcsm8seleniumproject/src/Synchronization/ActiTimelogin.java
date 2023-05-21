package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimelogin {

	public static void main(String[] args) {
		// ACTI-TIME TEST CASE TO MATCH THE TITLE
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	 driver.get("http://omsairam/login.do");
	 if(driver.getTitle())

	}

}
