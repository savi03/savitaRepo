package WindowBasePopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlePopUpByDoubleClickMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Handle popup
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://omsairam/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	// click on setting
	
	driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
	
	
	// click on logo and colour scheme
	
	driver.findElement(By.linkText("Logo & Color Scheme")).click();
	
	
	// to use custom logo
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	
	// use custom logo---choose file
	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	
	// create object of action class
	
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
	
	Thread.sleep(3000);
	
	// to handle file upload popup
	
	File file = new File("./autoit/FileUpload.exe");
	
	String absolutePath = file.getAbsolutePath();
	
	Runtime.getRuntime().exec(absolutePath);
	
	Runtime.getRuntime().exec(absolutePath);
	
	Thread.sleep(2000);
	
	
	
	
	
	
			

	}

}
