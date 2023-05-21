package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que2 {

	public static void main(String[] args) {
		// how to close all the browsers without quit()
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://omayo.blogspot.com/");
		 
		 WebElement link = driver.findElement(By.linkText("Open a popup window"));
		 
		 Point loc = link.getLocation();
		 int xAxis = loc.getX();
		 int yAxis = loc.getY();
		 System.out.println("x axis:"+ xAxis+" y axis :"+yAxis);
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 jse.executeScript("window.scrollBy("+xAxis+","+(yAxis-250)+")");
		 
		 link.click();
		 
		 Set<String> allHandles = driver.getWindowHandles();
		 
		 for (String wh:allHandles)
		 {
			 System.out.println(wh);
		 }
		 
		 


	}

}
