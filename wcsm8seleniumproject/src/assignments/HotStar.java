package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotStar {

	public static void main(String[] args) throws InterruptedException {
		// XPATH USING HOTSTAR
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='billboard-cta']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //span[contains(text(),\"Login\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Phone number']")).sendKeys("7204931204");
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
