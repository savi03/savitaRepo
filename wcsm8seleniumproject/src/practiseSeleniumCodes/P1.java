package practiseSeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		//MS EDGE
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 driver.close();

	}

}
