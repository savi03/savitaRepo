import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MobilePrice {

	public static void main(String[] args) throws InterruptedException {
		// TO PRINT MOBILE NAME ALONG WITH PRICE

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
	WebDriver	driver=new EdgeDriver(eo);
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("Mobile");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	

	}

}
