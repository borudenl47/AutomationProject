package KeyDrivenFrame;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActiTimeLoginValidData extends BaseTest
{

	public static void main(String[] args) throws IOException
	{
		//create object for BaseTest class to use inside methods 
		BaseTest bt = new BaseTest();
		bt.setUp(); //call the method setUp() to launch the browser & url from BaseTest class

		//login page credential 		
		//create object for flib class to use inside methods
		Flib flib = new Flib();
		//readPropertyData(String propPath ,String Key)
		String validusername = flib.readPropertyData(Prop_Path, "username");
		String validpassword = flib.readPropertyData(Prop_Path, "password");

		//pass the key
		driver.findElement(By.name("username")).sendKeys(validusername);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		driver.findElement(By.id("loginButton")).click();

		bt.tearDown();
	}

}
