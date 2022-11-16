package KeyDrivenFrame;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant
{
	static WebDriver driver;

	//setUp() class name is used to standard practice

	public void setUp() throws IOException //to launch the browser
	{
		Flib flib = new Flib(); //call flib class
		//Browservalue from property file
		String browserValue = flib.readPropertyData(Prop_Path, "browser");
		// url from property file
		String url = flib.readPropertyData(Prop_Path, "url");

		//select the browser
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Chrome_key, Chrome_path);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(gecko_key, gecko_path);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else
		{
			System.out.println("Invalid browser name");
		}

	}

	//close the broswer
	public void tearDown()
	{
		driver.quit();
	}

}
