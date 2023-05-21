package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {
		// TO take screenshot of Instagram
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");

		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/ss1.png");
		
		
		Files.copy(src,dest);
		
		



	}

}
