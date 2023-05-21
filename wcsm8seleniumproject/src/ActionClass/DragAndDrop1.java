package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// DRAG AND DROP ON PRACTICE WEB APP.

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement source2 = driver.findElement(By.xpath(" //a[text()=' 5000 ']"));
		
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement source4 = driver.findElement(By.xpath(" //a[text()=' 5000 ']"));
//		
		//----------------------------------------------------------------------------
		
		// DEBIT SIDE >> ACCOUNT EMPTY BOX
		WebElement target1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		
		// DEBIT SIDE >> AMOUNT EMPTY BOX
		WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
		
		
		// CREDIT SIDE >> ACCOUNT EMPTY BOX
		WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		
		// CREDIT SIDE >> AMOUNT EMPTY BOX
		WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
		
		
		
		// TO PERFORM DRAG AND DROP
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source2, target2).perform();
		
		
		act.dragAndDrop(source3, target3).perform();
		
		act.dragAndDrop(source4, target4).perform();
		
		
		
		
		
		

	}

}
