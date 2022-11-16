package readPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib {
public String readPropertyData(String proppath,String key) throws IOException {
	FileInputStream fis = new FileInputStream(proppath);
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	return value ;
}
}