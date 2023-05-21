package Udemi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class u1 {

	public static void main(String[] args) {
		// TODO gettext of error msg
		
		System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.instagram.com/");
	
	driver.findElement(BY.)

	}

}
