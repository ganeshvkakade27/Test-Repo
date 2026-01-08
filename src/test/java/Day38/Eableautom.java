package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eableautom {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://expired.badssl.com");
		
		System.out.println("Title:"+driver.getTitle());

	}

}
