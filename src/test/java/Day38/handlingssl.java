package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);   //accpts ssl certificates
		
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://expired.badssl.com");
		
		System.out.println("Title:"+driver.getTitle());

	}

}
