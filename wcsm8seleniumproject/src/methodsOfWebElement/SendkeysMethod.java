package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static  void main(String[] args) {
		// ActiTime Login By sending inputs
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://omsairam/login.do");
		
		// By method chaining
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		// By store in ref_variable
	//	WebElement	usernameTB=driver.findElement(By.name("username"));
	//	usernameTB.sendKeys("Admin");

	//	WebElement	passwordTB=driver.findElement(By.name("pwd"));
	//	passwordTB.sendKeys("manager");
		
	//	driver.close();

	}

}
