package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmaethods {

	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
        
	//title of web page
		System.out.println("Title of window:"+driver.getTitle());
	//current URL
		System.out.println("URL of webpage:"+driver.getCurrentUrl());
		
	//page source	
	System.out.println("page source:"+driver.getPageSource());
		
		//getWindow handle
	String base=driver.getWindowHandle();
		
		System.out.println("Get Window handle:"+base);
	
	//get windowid of multiple windows
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Instagram']")).click();
			Set<String> windowid=driver.getWindowHandles();
		
	System.out.println("\nWindows id:"+windowid);
	
	for(String wndha:windowid)
	{
		if(!wndha.equals(base))
		{
			driver.switchTo().window(wndha);
						break;
			
		}
		
	}
	
	
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9172035632");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc@123");
	driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']")).click();

	System.out.println("Title of the new window: " + driver.getTitle());
	
	driver.switchTo().window(base);
	
	
	
	
	
		
		driver.quit();
		
}
}
