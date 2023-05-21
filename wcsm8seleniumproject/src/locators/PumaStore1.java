package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaStore1 {

	public static void main(String[] args) throws InterruptedException {
		// using AXES XPATH
		
		System.setProperty("webdriever.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");//body[@class='en']
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Women']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
		driver.findElement(By.xpath("//body[@class='en']")).click();
		
	}
	
	}


