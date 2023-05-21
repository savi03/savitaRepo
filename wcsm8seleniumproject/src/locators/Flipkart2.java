package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {
			// FLIPKART Product select BOX
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//ChromeOptions co=new ChromeOptions();
		//	co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("HP Laptop");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='Core i7')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Brand']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("")).click();

	}

}
