import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// dashboards.handmadeinteractive.com/jasonlove/

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");

		// To perform scrolling options

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(2000);

		// ScrollDown

		jse.executeScript("window.scrollBy(0,350)");

		Thread.sleep(3000);

		jse.executeScript("window.scrollBy(0,-350)");

	}

}
