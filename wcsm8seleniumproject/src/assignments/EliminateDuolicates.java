package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuolicates {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/sange/OneDrive/Desktop/html%20tags/singledropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		// TO HANDLE DROPDOWN CREATE OBJ FOR SELECT CLASS
		Select sel = new Select(dropDown);
		
		// TO GET ALL THE OPTIONS FROM DROPDOWN
		
		List<WebElement> allOptions = sel.getOptions();
		
		// TO ELIMINATE DUPLICATES & MAINTAIN THE ORDER OF INSERTION WE USE
		
		TreeSet<String> ts = new TreeSet<String>();
		
		// TO READ THE LIST BY ELIMINATING DUPLICATES
		
		for(int i=0;i<allOptions.size();i++)
		{
			// GET THE OPTIONS & TEXT OF OPTIONS
		 String op = allOptions.get(i).getText();
		 
		 // ADD THE TEXT OF OPTIONS TO TREESET
		 ts.add(op);
		
			
		}
		
		// TO READ THE OPTIONS FROM SET
		for( String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
		

	}

}
