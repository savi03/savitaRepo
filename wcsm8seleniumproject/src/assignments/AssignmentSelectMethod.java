package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSelectMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/singledropdown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDown);
	List<WebElement> allOptions = sel.getOptions();
		// TO GET ALL THE OPTIONS FROM DROPDOWN
		
		for(WebElement op:allOptions)
		{
			if(op.getText().equals("pizza"))
			{
				Thread.sleep(2000);
				op.click();
				break;
			}
		}
	}

}
