package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		// USING CLASS NAME FRIENDS 
		System.setProperty("webdriever.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		

	}

}

//driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);Chandler Bing


//driver.findElement(By.className("lNPNe")).click();
