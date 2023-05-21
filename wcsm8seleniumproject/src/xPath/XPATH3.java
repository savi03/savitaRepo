package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPATH3 {

	public static void main(String[] args) throws InterruptedException {
		// NETFLIX USING XPATH
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='id_userLoginId']")).sendKeys("savita03");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='id_password']")).sendKeys("ativas03");
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='btn login-button btn-submit btn-small']")).click();
		//btn login-button btn-submit btn-small





	}

}
//nfTextField error