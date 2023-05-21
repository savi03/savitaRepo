package practiseSeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
		// getPageSourceMethod using Edge and current url
		WebDriver driver=new EdgeDriver();
       driver.get("https://www.instagram.com/");
      String sourceCode=driver.getPageSource();
      System.out.println(sourceCode);
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
       driver.getCurrentUrl();
       driver.close();
	}

}
