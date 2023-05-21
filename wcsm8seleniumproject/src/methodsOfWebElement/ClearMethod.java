package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://omsairam/login.do");


		// By store in ref_variable
		WebElement	usernameTB=driver.findElement(By.name("username"));
		
		WebElement	passwordTB=driver.findElement(By.name("pwd"));

		usernameTB.sendKeys("Admin");
		passwordTB.sendKeys("manager");
		Thread.sleep(2000);
		
		usernameTB.clear();
		Thread.sleep(2000);
		passwordTB.clear();
		
		driver.close();
		











	}

}
