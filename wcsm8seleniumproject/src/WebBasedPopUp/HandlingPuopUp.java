package WebBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPuopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/alertpopup.html");

		// generate the Alert popup
		driver.findElement(By.xpath("//button[.='Click me!']")).click();

		// switch the controls to Alert popup
		//Thread.sleep(2000);
		Alert al = driver.switchTo().alert();

		// 1} Accept the alert Popup
		Thread.sleep(2000);
		//   al.accept();

		//   2} Dismiss the alert Popup
	//	al.dismiss();

		//    3} Print the Text of alert Popup
		 System.out.println(al.getText());
		 al.dismiss();
		//  4} pass the characters to alert Popup
		//al.sendKeys("aaaaaa");
	}
}



