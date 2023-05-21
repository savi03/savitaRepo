package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	public static void main(String[] args) {
		// TO GET THE ATTRIBUTE NAME OF PARTICULAR WEB ELEMENT

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");

		WebElement value = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		String classValue = value.getAttribute("class");
		System.out.println(classValue);


	}

}
