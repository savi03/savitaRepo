package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LocatorWithId3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(eo);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Savita03");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ativas@03");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.name(""))

	}

}
