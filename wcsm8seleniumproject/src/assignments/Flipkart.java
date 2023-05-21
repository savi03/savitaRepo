package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// FLIPKART SEARCH BOX
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("HP Laptop");
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(text()='Brand')]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@class='_3879cV' and(text()='HP')]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 10']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Touch Screen']")).click();
	
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Yes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Dedicated Graphics Memory']")).click();
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='8 GB']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		Thread.sleep(2000);
	
		String	priceOfFirstLaptop=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	
		System.out.println(priceOfFirstLaptop);
	
		driver.quit();
			//	Thread.sleep(2000);
			driver.quit();
	}

}
