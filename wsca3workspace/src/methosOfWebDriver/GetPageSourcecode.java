package methosOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourcecode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("");
	Thread.sleep(5000);
	String PageSourceCode=driver.getPageSource();
	}
}

