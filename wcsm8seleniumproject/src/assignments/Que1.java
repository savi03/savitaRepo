package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {

	public static void main(String[] args) {
		// Close all the browsers
		
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
		 


	}

}
