package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		// Used to get location as well as size of web-element
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement  button= driver.findElement(By.xpath("//button[text()=' Login ']"));
		Rectangle rect = button.getRect();
		int xAxis = rect.getX();

		int yAxis = rect.getY();

		System.out.println("x axis:"+ xAxis+" y axis:"+yAxis);

		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println("Height:"+height +" Width :"+width);
	}

}
