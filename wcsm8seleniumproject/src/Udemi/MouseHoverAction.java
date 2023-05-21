package Udemi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//	Thread.sleep(2000);
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		
		admin.click();
		Actions act = new Actions(driver);


	//	WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		WebElement mag = driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']"));
		act.moveToElement(mag).click().perform();
		WebElement user = driver.findElement(By.xpath("//a[text()='Users']"));

		//admin.click();

		


	

		act.moveToElement(user).click().perform();
	}

}
