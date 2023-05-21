package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex1 {

	public static void main(String[] args) throws InterruptedException {
		// Multi SELECT DROP-DOWN BY USING INDEX VALUE
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/multipledropdown.html");
		 
		 WebElement dropDown = driver.findElement(By.name("menu"));
		 Select sel = new Select(dropDown);
		 
		 //SELECT SINGLE OPTIONS FROM MULTI SELECT DROPDWON
		 
		 sel.selectByIndex(2);
		 
		 // SELECT MULTIPLE OPTIONS FROM MULTI SELECT DROPDOWN
		 
		 for(int i=0;i<=3;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(2000);
			 
		 }
		 
		 

	}

}
