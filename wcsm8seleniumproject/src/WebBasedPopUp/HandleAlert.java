package WebBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// to handle alert popup by creating our own html tag for alert popup
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/alertpopup.html");
	
	// generate alert popup
	
	driver.findElement(By.xpath(" //button[.=' Click me!']")).click();
	
	// to handle alert
	
	Alert alt=driver.switchTo().alert();
	Thread.sleep(2000);
	
	// alt.accept();
	//alt.accept();
	
	// to print text 
	System.out.println(alt.getText());
	
	alt.dismiss();
	
	driver.close();
	
	

	}

}
