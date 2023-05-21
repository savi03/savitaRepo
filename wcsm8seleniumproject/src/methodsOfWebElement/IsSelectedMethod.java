package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		// TO VERIFY WHETHER WEB-ELEMENT IS SELECTED OR NOT
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://omsairam/login.do");
	
	WebElement checkBox = driver.findElement(By.name("remember")); // To verify whether check box is selected or not
		boolean verify = checkBox.isSelected();
		System.out.println(verify); // FALSE---NOT SELECTED
		
		checkBox.click();
		boolean verify1 = checkBox.isSelected();
		System.out.println(verify1); //TRUE---SELECTED
		
		

	}

}
