package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		// PRINT THR TEXT OF LOGIN BUTTON AND FORGOT PASSWORD LINK
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String loginText = driver.findElement(By.xpath(" //button[text()=' Login ']")).getText();
		System.out.println(loginText);

		String fgtPwd=driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).getText();
		System.out.println(fgtPwd);


	}

}
