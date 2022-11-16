package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNamelocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=10867730239119948630&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301900&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=Cj0KCQjw4omaBhDqARIsADXULuV8z36lk-Xm-7M0qfukZyCASlVXmx9vGjxH2uyXSdrjFyRWqGvGTDcaAtDYEALw_wcB");
	driver.findElement(By.className("icp-nav-link-inner"));
        
    
	}

}
