package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorWithId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	//driver.get("https://app.fireflink.com/signin");
	

    driver.get("https:www.jeevansathi.com/static/logoutPage");
	//Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("savita03");
	//Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("savita@03");
//	Thread.sleep(2000);
	driver.findElement(By.id("jspcLoginLayerButton")).click();
	driver.close();

	}

}
