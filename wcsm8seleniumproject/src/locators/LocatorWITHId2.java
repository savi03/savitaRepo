package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorWITHId2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.jeevansathi.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("loginTopNavBar")).click();
		Thread.sleep(4000);
		//driver.navigate().refresh();
		driver.findElement(By.id("EmailContainer")).sendKeys("savita035.t@gmail.com");
		driver.findElement(By.id("PasswordContainer")).sendKeys("7204931204");
		Thread.sleep(2000);
		driver.findElement(By.id("jspcLoginLayerButton")).click();
		driver.close();

	}

}
