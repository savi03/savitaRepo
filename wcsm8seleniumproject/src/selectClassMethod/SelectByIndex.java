package selectClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		// SINGLE SELECT DROP-DOWN BY USING INDEX VALUE

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/singledropdown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		sel.selectByIndex(2);



	}

}
