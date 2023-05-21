package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		// VERIFY THE WEB-ELEMENT IS ENABLED OR DISABLED
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");

		// WHEN INPUTS ARE NOT GIVEN THE LOGIN-BUTTON IS DIABLED

		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		boolean verify = loginButton.isEnabled();
		System.out.println(verify);  //FALSE

		// WHEN IPUTS ARE PROVIDED IN USN & PWD TB THE LOGIN-BUTTON IS ENABLED

		driver.findElement(By.name("username")).sendKeys("savita thombare");
		driver.findElement(By.name("password")).sendKeys("ativas03");

		boolean verify1 = loginButton.isEnabled();
		System.out.println(verify1); //TRUE

	}

}
