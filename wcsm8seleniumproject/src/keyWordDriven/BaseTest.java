package keyWordDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {                  //  IAC        Flib
                                                                          //          \      .
	static WebDriver driver;                                                  //       BAseTest
	
	public void openBrowser() throws IOException                             //
	{
	   Flib flib = new Flib();
	   String browserValue = flib.readPropertyData(Prop_path,"browser");
	    String url = flib.readPropertyData(Prop_path, "url");
	    
	    if(browserValue.equals("chrome"))
	    {
	    	System.setProperty(Chrome_key, Chrome_path);
	    	
	    	driver=new ChromeDriver();
	    	
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	
	    	driver.get(url);
	    }
	    else if(browserValue.equals("Firefox"))
	    {
	    	System.setProperty(Gecko_key, Gecko_path);
	    	
	    	driver=new FirefoxDriver();
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	
	    	driver.get(url);
	    }
	    else if(browserValue.equals("Edge"))
	    {
	    	System.setProperty(Edge_key, Edge_path);
	    	
	    	driver=new EdgeDriver();
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	
	    	driver.get(url);
	    }
	    else
	    {
	    	System.out.println("not suitable browserValue");
	    }
	  	
	  
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

	}


