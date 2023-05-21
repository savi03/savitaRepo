package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

 
 
 
 Thread.sleep(2000);
 
 String parentHandle = driver.getWindowHandle();
 System.out.println(parentHandle);
 
 link.click();
 
 Set<String> parentHadnles = driver.getWindowHandles();
 
 
 
 
	}

}
