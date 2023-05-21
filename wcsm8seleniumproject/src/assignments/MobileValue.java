package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MobileValue {

	public static void main(String[] args) throws InterruptedException {
		// TO PRINT MOBILE NAME ALONG WITH PRICE

		//		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		//
		//		EdgeOptions eo = new EdgeOptions();
		//		eo.addArguments("--remote-allow-origins=*");
		//		WebDriver	driver=new EdgeDriver(eo);
		//		
		//		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		for(int i=0;i<options.size();i++)
		{
			String nameOfMobiles=options.get(i).getText();

			for(int j=i;j<=i;j++)
			{
				String priceOfMobiles=allOptions.get(j).getText();
				System.out.println(nameOfMobiles+" :"+priceOfMobiles);
				Thread.sleep(2000);
			}

		}
	}

}
