package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WynkMusic {

	public static void main(String[] args) throws InterruptedException {
		// USING XPATH AUTOMATE WYNK MUSIC
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://wynk.in/music");
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//input[@placeholder='Search songs, artists & podcasts you love!']")).click();
		//  Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='hidden sm:block placeholder-elipsis w-full h-full outline-none text-title bg-transparent text-sm sm:text-base dark:placeholder:text-wynk-gray1 ml-2 font-light']")).click();
		driver.findElement(By.xpath("//input[@class='hidden sm:block placeholder-elipsis w-full h-full outline-none text-title bg-transparent text-sm sm:text-base dark:placeholder:text-wynk-gray1 ml-2 font-light']")).sendKeys("Ninnanu Nodida");

	}

}
