package KeyDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class TestActiTimeValidLogin  extends BaseTestData{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	BaseTestData bt = new BaseTestData();
	bt.setuUp();//open the browser
   Flib flib = new Flib();
   String validUsername = flib.readPropertyData("./data/config.properties", "username");
   
   String validpassward = flib.readPropertyData("./data/config.properties", "passward");
  driver.findElement(By.name("username")).sendKeys(validUsername);
   driver.findElement(By.name("pwd")).sendKeys(validpassward);
   driver.findElement(By.id("loginButton")).click();
 bt.tearDown();
   
   
	}

}
