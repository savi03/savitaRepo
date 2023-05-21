package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class getCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//	ChromeOptions co = new ChromeOptions();
	//	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
