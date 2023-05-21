package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		
		// to launch edge browser 
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//upcasting
		
		//maximize the browser
		
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.close();
	}

}
