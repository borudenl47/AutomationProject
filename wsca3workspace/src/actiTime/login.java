package actiTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=17fxc12irosmr");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	String logintitle = driver.getTitle();
	if(logintitle.equals("actiTIME - Login"))
	{
		System.out.println("logintitle test case is pass");
	}
	else
	{
		System.out.println("test case is fail");
	}
	
		driver.findElement(By.name("username")).sendKeys("admin");;
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String homepage = driver.getTitle();
		if(homepage.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("homepage test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		driver.quit();
	}
	}

