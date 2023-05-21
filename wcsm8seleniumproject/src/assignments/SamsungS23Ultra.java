package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungS23Ultra {

	public static void main(String[] args) throws InterruptedException {
		// Flipkart....inspect search box....
		//		samsungs23 ultra......click on mobile name.....
		//		select the color.....select storage....delivery checkbox(411033).....
		//		click on check(verify)......click on add to cart.....click on remove
		//		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		// web-base pop-up/hidden division pop-up
		WebElement popup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		popup.click();

		// Search box
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung s23 ultra");

		//click on magnifying glass
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		// handle of parent window
		String parentHandle = driver.getWindowHandle();

		Thread.sleep(2000);
		//click on samsung s23 mobile 
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();

		// handle of parent and child window
		Set<String> allHandles = driver.getWindowHandles();

		for(String wh:allHandles )
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);

			}
			else
			{

			}
		}
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
		{
			System.out.println("its child window");

		}
		else
		{
			System.out.println("window is not handle");

		}

		WebElement scrollTillThisWebELement = driver.findElement(By.xpath("//span[text()='View Details']"));

	    Point loc =  scrollTillThisWebELement.getLocation();
		int xAxis = loc.getX();
		int yAxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("window.scrollBy("+xAxis+","+(yAxis-250)+")");
		
		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xAxis+","+(yAxis-250)+")");
		
		
		
		
		
	}
}



















//		Thread.sleep(2000);
//
//		WebElement link = driver.findElement(By.id("//span[@id='Color']"));
//
//		Point loc = link.getLocation();
//		int xAxis = loc.getX();
//		int yAxis = loc.getY();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//		jse.executeScript("window.scrollBy("+xAxis+","+(yAxis-250)+")");
//
//
//		//driver.findElement(By.xpath("//span[text()='Color']"));
//
//
//
//		driver.findElement(By.xpath("//span[text()='Storage']"));
//
//		driver.findElement(By.xpath("//a[text()='256 GB']/ancestor::li[@class='_3V2wfe']")).click();
//
//		//	driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::a[@class='kmlXmn']/following-sibling::div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM']/descendant::div[text()='Cream']"));
//
//		//driver.findElement(By.xpath("//div[@class='_3Oikkn _3_ezix _2KarXJ'and(text()='Cream')]")).click();
//	}
//
//}
