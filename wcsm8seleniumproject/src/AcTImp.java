import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcTImp {

	public static void main(String[] args) {
		// ActiTime by applying implicit wait
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omsairam/login.do");
		String	loginPageTitle=driver.getTitle();
		System.out.println("loginPageTitle");
		if (driver.getTitle().equalsIgnoreCase("actiTime-Login"))
		{
			//System.out.println();
			driver.findElement(By.name("username")).sendKeys("admin");

			driver.findElement(By.name("pwd")).sendKeys("manager");

			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			System.out.println("test case failed");
		}
	}

}
