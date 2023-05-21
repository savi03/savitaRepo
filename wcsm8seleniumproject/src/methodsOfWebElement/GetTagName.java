package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTagName {

	public static void main(String[] args) {
		// TO GET THE TAGE NAME OF WEB-ELEMENT
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");
		WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));
		String tagName = element.getTagName();
		System.out.println(tagName);

	}

}
