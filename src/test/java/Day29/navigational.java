package Day29;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigational {

	
	public static void main(String args[]) throws InterruptedException, MalformedURLException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//driver.get("https://demo.nopcommerce.com");
		URL myurl=new URL("https://demo.opencart.com/");
		
		driver.navigate().to("https://demo.nopcommerce.com");
		
		driver.navigate().to(myurl);
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
