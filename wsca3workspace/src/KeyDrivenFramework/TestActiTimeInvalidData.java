package KeyDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import dataDrivenFramework.Flib;


	public class TestActiTimeInvalidData  extends BaseTestData
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
		{
		BaseTestData bt = new BaseTestData();
		bt.setuUp();//open the browser
	   Flib flib = new Flib();

	   
	   int rc = flib.getRowCountMethod("./data/testdata.xlsx", "invaliddata");
	     for(int i=1;i<=rc;i++) 
	     {
	    	String invalidUserName = flib.readExcelData("./data/testdata.xlsx", "invaliddata", i, 0);
	    	driver.findElement(By.name("username")).sendKeys(invalidUserName);
	    	Thread.sleep(2000);
	    	
	    	
	    	String invalidpassward = flib.readExcelData("./data/testdata.xlsx", "invaliddata", i, 1);
	    	    	driver.findElement(By.name("pwd")).sendKeys(invalidpassward);
	    	    	driver.findElement(By.id("loginButton")).click();
	    	    	Thread.sleep(3000);
	    	    	driver.findElement(By.name("username")).clear();
	    	    	driver.quit();
	     }	 
	     
	     
	     
	     
	}




}
