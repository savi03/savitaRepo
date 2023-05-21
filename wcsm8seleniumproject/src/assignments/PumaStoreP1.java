package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 public class PumaStoreP1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Women']")).click();
		driver.findElement(By.xpath("//a[text()='Shoes']")).click();
		driver.findElement(By.xpath("//h3[text()=\"Kosmo Rider Tonal Women's Sneakers\"]")).click();
		
	}

}
