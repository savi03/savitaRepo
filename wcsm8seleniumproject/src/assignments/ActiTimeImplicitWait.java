package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeImplicitWait {

	public static void main(String[] args) {
		// ActiTime Using If ElSE Condition

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omsairam/login.do");
		String	loginPageTitle=driver.getTitle();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				if(loginPageTitle.equalsIgnoreCase("actiTime-Login"))
				{
					System.out.println("Test case passed login page verify");
				}


				else
				{
					System.out.println("Test case failed login page not verified");
				} 

		driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();


	}

}

