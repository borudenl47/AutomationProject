package methosOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:/www.google.com");
		// driver.navigate().to("/https:/www.google.com").
		// driver.switchTo().activeElement().sendKeys("diwali",Keys.ENTER);
		// driver.navigate().forward();
		// driver.navigate().back();
		// driver.navigate().refresh();
}
}
