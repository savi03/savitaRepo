package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		// to handle chat-box

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		Thread.sleep(2000);

		// switch the controls to frame for click on chat Box
		
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		
		// Swith the controls to frame for click on chat Box
		
		driver.switchTo().frame("fc_widget");// by using name or id
		
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));

		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		
		// switch the control to default webpage
		
		driver.switchTo().defaultContent();
		
		//insert the inputs for textbox
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Savita024");
		
		driver.findElement(By.id("chat-fc-email")).sendKeys("324662");
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234556778");
		
		driver.findElement(By.className("fc-button")).click();
		

		//	WebElement chatBox = driver.findElement(By.xpath("//div[@id='chat-icon']/ancestor::div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']"));

		

	}

}




