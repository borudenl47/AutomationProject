package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=e7kfi66klp6b1");
	Thread.sleep(3000);
	
	Flib flib = new Flib();
	int rowcount = flib.getRowCountMethod("./Data/testdata.xlsx", "invaliddata");
	
	//use for loop to cover all invalid scenario from excel data
	for(int i=1;i<=rowcount;i++)
	{
		//invalid username from excel 
		String invalidusername = flib.readExcelData("./Data/testdata.xlsz", "invaliddata", i, 0);
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		
		//invalid password from excel
		String invalidpassword = flib.readExcelData("./Data/testdata.xlsz", "invaliddata", i, 1);
		driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		//to clear the data of username textbox - apply for ActiTime only
		driver.findElement(By.name("username")).clear();				
	}
	
	}

}
