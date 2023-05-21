package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static  void main(String[] args) {
		// to verify whether WebElement is present or not
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe" );
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.netflix.com/in/Login");
	
	WebElement usnTB = driver.findElement(By.name("userLoginId"));
	WebElement pwdTB = driver.findElement(By.name("password"));
	WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
	
	if(usnTB.isDisplayed())
	{
		usnTB.sendKeys("rahbuus");
	}
	else
	{
		System.out.println("will get an exception");
	}
	if(pwdTB.isDisplayed())
	{
		pwdTB.sendKeys("56t5r");
	}
	else
	{
		System.out.println("will get an exception");
	}
	if(button.isDisplayed())
	{
		button.click();
	}
	else
	{
		System.out.println("is not cliskable");
	}
	
	
	
	

	}

}
