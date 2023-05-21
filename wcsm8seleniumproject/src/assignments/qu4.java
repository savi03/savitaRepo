package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qu4 {

	public static void main(String[] args) throws InterruptedException {
		// how to close only child browser
		
		
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
		 
		 // handle or address of parent window
		 
		 String parentHandle = driver.getWindowHandle();
		 
		 // click on link and close child window
		 link.click();
		 
		 Thread.sleep(2000);
		 
		 // handle of all the windows
		 
		 Set<String> allHandles = driver.getWindowHandles();
		 
		 for(String wh:allHandles)
		 {
			 if(!parentHandle.equals(wh))
			 {
				 driver.switchTo().window(wh).close();
			 }
		 
		 
		 // to close only child browser
	}
}

}
