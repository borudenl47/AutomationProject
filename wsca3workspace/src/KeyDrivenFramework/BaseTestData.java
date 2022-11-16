package KeyDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestData
{
    static WebDriver driver;
    
    public void setuUp() throws EncryptedDocumentException, IOException
    {
    	
    Flib flib = new Flib();
     String browservalue = flib.readPropertyData("./data/config.properties", "browser");
     String url = flib.readPropertyData("./data/config.properties", "url");
     if(browservalue.equalsIgnoreCase("chrome"))
      	
    {
    		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	     WebDriver driver=new ChromeDriver();
    	     driver.manage().window().maximize();
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	     driver.get(url);
    	     
    }
     
    
    else if(browservalue.equalsIgnoreCase("firefox"))
    {
    
    		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    	      driver=new FirefoxDriver();
    	     driver.manage().window().maximize();
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	     driver.get(url);
    	     
    }
    else
    {
    	System.out.println("invalid browser name");
    	
    }
    }
	public void tearDown()
	{
		driver.quit();
	}
	
}
