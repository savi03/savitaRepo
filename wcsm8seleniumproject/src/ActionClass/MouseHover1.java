package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void DEMO(String[] args) {
		// TO CHECK WHETHER COIN IS DISPLAYED
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Coins '] "));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath(""))
		
		
		//span[text()='1 gram']and(contains(@data-p='gold-coins-weight-1gms,m'))]

	}

}
