package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselctByValue {

	public static void main(String[] args) throws InterruptedException {
		// DESELECTING BY USING VALUE ATTRIBUTE
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/multipledropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);
         
		// select all options using index
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByIndex(4);
		// deselect by using value
		
		
	}

}
