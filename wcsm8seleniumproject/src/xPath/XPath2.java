package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPath2 {

	public static void main(String[] args) throws InterruptedException {
		// USING XPATH IN INSTAGRAM
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Savita03");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
