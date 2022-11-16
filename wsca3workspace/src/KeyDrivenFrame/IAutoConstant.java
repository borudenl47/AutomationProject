package KeyDrivenFrame;

public interface IAutoConstant
{
	//In interface store all file path data which used in every class common

	//system.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe")
	String Chrome_key="webdriver.chrome.driver";
	String Chrome_path="./drivers/chromedriver.exe";

	//system.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe")
	String gecko_key="webdriver.gecko.driver";
	String gecko_path="./drivers/geckodriver.exe";
	
	//Excel file path which store data 
	String Excel_Path="./Data/testdata.xlsx";
	
	//Property file path which store valid 
	String Prop_Path="./Data/config.properties";
	
	


}
