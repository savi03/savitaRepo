package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) {
		// PROVIDE IMPLICIT WAIT
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("savita035");
		driver.findElement(By.name("password")).sendKeys("ativas@03");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.close();
	}

}
