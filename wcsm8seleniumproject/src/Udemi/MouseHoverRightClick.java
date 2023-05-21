package Udemi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverRightClick {

	public static void main(String[] args) {
		// 
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act = new Actions(driver);
	
	WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	act.contextClick(button).perform();
	driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert();
	

	}

}
