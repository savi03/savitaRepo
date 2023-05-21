package assignments;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insta {

	public static void main(String[] args) {
		// SYNCHRONIZATION
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver	driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("Savita03");
		
		driver.findElement(By.name("password")).sendKeys("Ativas@03");
		
		driver.findElement(By.className("_acan _acap _acas _aj1-")).getText();


	//	driver.findElement(By.className("_acan _acap _acas _aj1-")).click();



	}

}
