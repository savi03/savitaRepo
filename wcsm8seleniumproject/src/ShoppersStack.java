import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.shoppersstack.com/");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("580023");
		//driver.findElement(By.xpath("//button[@id='Check']")).click();
		driver.findElement(By.xpath("//button[text()='Check']")).click();
	}

}
