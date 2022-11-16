package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.get("http://127.0.0.1/login.do;jsessionid=37ceu3j0bi5qf");
	     
	     Flib flib = new Flib();
	    String validusername = flib.readPropertyData("./data/config.properties", "username");
	     
	     driver.findElement(By.name("username")).sendKeys(validusername);
	     
       String validpassward = flib.readPropertyData("./data/config.properties", "passward");
	     
	     driver.findElement(By.name("pwd")).sendKeys(validpassward);
	     driver.findElement(By.id("loginButton")).click();
}
}
