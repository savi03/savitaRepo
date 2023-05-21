package practiseSeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TO handle exception we use static method before creating object
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch browser by creating object
		//only if ConnectionFailedException occurs then we need to handle it before creating object
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);//IllegalStateException-path of driver executable file
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

	}

}
