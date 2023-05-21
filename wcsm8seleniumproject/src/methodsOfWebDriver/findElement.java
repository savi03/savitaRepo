package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElement {

	public static void main(String[] args) throws InterruptedException {
		// ACTI-TIME LOGIN USING FIND-ELEMENT METHOD
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://omsairam/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		System.out.println(username);
		Thread.sleep(2000);
		driver.close();
	}

}
