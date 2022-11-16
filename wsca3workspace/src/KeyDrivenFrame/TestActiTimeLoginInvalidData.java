package KeyDrivenFrame;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActiTimeLoginInvalidData extends BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		//To launch the browser and  create object for BaseTest class and call the setUp() method
		BaseTest bt = new BaseTest();
		bt.setUp();

		// create the object for Flib class
		// call the getRowCountMethod() method
		Flib flib = new Flib();
		//get used row count from excel
		int rowcount = flib.getRowCountMethod(Excel_Path, "invaliddata");

		//use for loop to cover all invalid scenario from excel data
		//i=1 we should dont consider tag/heard of the row so start from record row (index start from 0)
		//i<=rowcount-condition apply for only used row from excel

		for(int i=1;i<=rowcount;i++)
		{
			//readExcelData()-method to read the row data 
			String invalidusername = flib.readExcelData(Excel_Path, "invaliddata", i, 0);// i=row 0=username column 
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			Thread.sleep(2000);

			String invalidpassword = flib.readExcelData(Excel_Path, "invaliddata", i, 1);// i=row 1=password column 
			driver.findElement(By.name("username")).sendKeys(invalidpassword);
			Thread.sleep(2000);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);

			//to clear the data of username textbox - apply for ActiTime only
			driver.findElement(By.name("username")).clear();	
			
		}
            bt.tearDown();
            
            System.out.println("all possible invalid scenario pass ");

	}

}
