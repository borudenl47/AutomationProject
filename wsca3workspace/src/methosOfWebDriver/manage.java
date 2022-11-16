package methosOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:/www.google.com");
		Dimension targetSize=new Dimension(550,350);
		// Point targetPosition=new Point(450,300);
		//driver.manage().window().setPosition(targetPosition);
		 driver.manage().window().setSize(targetSize);
	}
}
