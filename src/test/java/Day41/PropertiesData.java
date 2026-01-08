package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesData {

	public static void main(String[] args) throws IOException {
		
		
		Properties probj=new Properties();
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
	probj.load(file);
	
	//reading data
	String url=probj.getProperty("appURL");
	
	String username=probj.getProperty("usename");
	String pass=probj.getProperty("pass");
	
	System.out.println("URL:"+url+"\nUsename:"+username+"\nPAss:"+pass);
	
		
	}
	

}
