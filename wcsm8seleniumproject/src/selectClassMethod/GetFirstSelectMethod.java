package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectMethod {

	public static void main(String[] args) throws InterruptedException {
		// OPTION SHOULD BE SELECTED
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/multipledropdown.html");
		

		WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDown);

		// TO READ THE OBJECT 
		for(int i=2;i<5;i++)
		{
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		WebElement firstOption = sel.getFirstSelectedOption();
		// USED TO GET TEXT OF THE WEB-ELEMENT
		String value = firstOption.getText();
		System.out.println(value);
	}

}
