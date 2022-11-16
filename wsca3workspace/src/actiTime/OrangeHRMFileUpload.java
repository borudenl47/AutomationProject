package actiTime;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dataDrivenFramework.Flib;

public class OrangeHRMFileUpload
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Flib flib = new Flib();
		String Username = flib.readExcelData("./Data/testdata.xlsx", "validdata", 2, 0);
		String password = flib.readExcelData("./Data/testdata.xlsx", "validdata", 2, 1);

		//Login OrangeHRM with Xpath
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		//click on 'Admin' link
		//driver.findElement(By.linkText("/web/index.php/admin/viewAdminModule")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		
		//click on 'Corporate Branding'
		driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
		Thread.sleep(3000);
		//click on 'Browser' to upload file
		WebElement target = driver.findElement(By.xpath("(//div[@class='oxd-file-button'])[1]"));
		Thread.sleep(3000);
		//create object for Action(broswerRefVariable) class
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		//use doubleClick() method for file upload operation single click it not work
		//Note:- perform() method mandetory to perfrom the doubleClick Action
		action.click(target).perform();

		//to upload file use AutoIt VB script writed file path
		//we use doubleClick() method so have perform 2 times
		Runtime.getRuntime().exec("D:\\wcsa3workspace\\wcsa3seleniumproject\\autoIt\\FileUpload.exe");
	Runtime.getRuntime().exec("D:\\wcsa3workspace\\wcsa3seleniumproject\\autoIt\\FileUpload.exe");
		

	}
}