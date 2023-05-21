package practiseSeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P3 {
	public static void name(String[]args) {
		//MS Edge-------getTitleMethod
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		String loginPageTitle=driver.getTitle();
		System.out.println(loginPageTitle);


	}

}
