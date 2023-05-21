package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {

	public static void main(String[] args) throws InterruptedException {
		// 5. perform the maximize action on anyone of the child window?
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://omayo.blogspot.com/");
		 
		 WebElement link = driver.findElement(By.linkText("Open a popup window"));
		 
		 Point loc = link.getLocation();
		 int xAxis = loc.getX();
		 int yAxis = loc.getY();
		// System.out.println("x axis:"+ xAxis+" y axis :"+yAxis);
		 
		 // scrolling operation
		
		 Thread.sleep(2000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 jse.executeScript("window.scrollBy("+xAxis+","+(yAxis-250)+")");
		
		 Thread.sleep(2000);
		 
		 // address of parent window
		 
		 String parentHandle = driver.getWindowHandle();
		 
		 // click on child window
		 link.click();
		 
		 // address of parent and child window
		 
		 Set<String> allHandles = driver.getWindowHandles();
		 
		 // maximize the child browser
		 
		 for(String wh:allHandles)
		 {
			 if(!parentHandle.equals(wh))
			 {
				 driver.switchTo().window(wh).manage().window().maximize();
				 Thread.sleep(2000);
			 }
		 }
		 
		 
		 

	}

}
