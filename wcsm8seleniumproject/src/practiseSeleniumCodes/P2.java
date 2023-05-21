package practiseSeleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		// MS Edge
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElements(By.xpath("//a[.='open a popup window']"));
		Thread.sleep(3000);
		Thread.sleep(2000);
		driver.quit();
	}

	}


