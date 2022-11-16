package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:/www.flipkart.com");
		 //CLOSE POP  TAB
		 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		 // SEARCH TAB
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp laptops");
		 //CLICK ON SEARCH BUTTON
		 driver.findElement(By.xpath("// button[@class=\"L0Z3Pu\"]")).click();
		 // TO PRINT THE 1ST SUGGESTION ON ECLIPS
		String priceofHPLaptop = driver.findElement(By.xpath("(//div[text()='HP Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) 14s - dy2507TU Thin and Light Laptop']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		 
	        System.out.println(priceofHPLaptop+":this is the price of hp laptop");

}
}

	

