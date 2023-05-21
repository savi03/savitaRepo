package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchChromeBrowser {
	
	public static void main(String[] args) {
		//IllegalStateException
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// TO launch chrome browser
		ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		new ChromeDriver(co);
		
     
	}

}
