package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getPageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.instagram.com/");
		
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();



	}

}
