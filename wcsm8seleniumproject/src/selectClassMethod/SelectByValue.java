package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {
		// By value we need to use
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/multipledropdown.html");
	 WebElement dropDown = driver.findElement(By.name("menu"));
	Select sel=new Select(dropDown);
	Thread.sleep(3000);
	sel.selectByValue("v2");
	
 
	}

}
