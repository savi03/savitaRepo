package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsWithSelector1 {

	public static void main(String[] args) throws InterruptedException {
		// USING CSS SELECTOR---1
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		//driver.findElement(By.className())
		driver.findElement(By.className("e8zpj0e1 default-ltr-cache-v9h1tk")).click();
	//	driver.findElement(By.className("a-form-label")).click();
		
	//	 e8zpj0e1 default-ltr-cache-v9h1tk

	}

}
//a-button-inner
//a-form-label
